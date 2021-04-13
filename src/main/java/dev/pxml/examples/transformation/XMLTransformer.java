package dev.pxml.examples.transformation;

import dev.pxml.core.utilities.PXMLToXMLConverter;
import dev.pxml.core.utilities.XMLUtilities;
import dev.pxml.examples.Config;
import dev.pxml.examples.Utilities;
import org.w3c.dom.Document;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class XMLTransformer {

    private final static File XMLFile = Config.inputFile ( "books.xml" );
    private final static File PXMLFile = Config.inputFile ( "books.pxml" );
    private final static File XSLTFile = Config.inputFile ( "books.html.xslt" );
    private final static File PXSLTFile = Config.inputFile ( "books.html.pxslt" );
    private final static File HTMLFile = Config.outputFile ( "books.html" );

    public static void transformWithXMLAndXSLT() throws Exception {

        logMessage ( XMLFile, XSLTFile, HTMLFile );

        transformWithDocuments(
            XMLUtilities.XMLFileToXMLDocument ( XMLFile ),
            XMLUtilities.XMLFileToXMLDocument ( XSLTFile ),
            new FileWriter( HTMLFile ) );
    }

    public static void transformWithPXMLAndPXSLT() throws Exception {

        logMessage ( PXMLFile, PXSLTFile, HTMLFile );

        transformWithDocuments(
            PXMLToXMLConverter.PXMLFileToXMLDocument ( PXMLFile ),
            PXMLToXMLConverter.PXMLFileToXMLDocument ( PXSLTFile ),
            new FileWriter( HTMLFile ) );
    }

    public static void transformWithDocuments ( Document XMLDocument, Document XSLTDocument, Writer writer )
        throws Exception {

        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer ( new DOMSource ( XSLTDocument ) );
        transformer.transform ( new DOMSource ( XMLDocument ), new StreamResult ( writer ) );
    }

    static void logMessage ( File dataFile, File templateFile, File resultFile ) {

        System.out.println();
        System.out.println ( "Transforming" );
        System.out.println ( "     data: " + Utilities.fileMessage ( dataFile ) );
        System.out.println ( " template: " + Utilities.fileMessage ( templateFile ) );
        System.out.println ( "   result: " + Utilities.fileMessage ( resultFile ) );
    }
}
