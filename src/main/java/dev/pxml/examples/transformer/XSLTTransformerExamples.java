package dev.pxml.examples.transformer;

import dev.pxml.core.utilities.XSLTTransformer;
import dev.pxml.examples.Config;
import dev.pxml.examples.Utilities;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class XSLTTransformerExamples {

    private final static File XMLFile = Config.inputFile ( "books.xml" );
    private final static File PXMLFile = Config.inputFile ( "books.pxml" );
    private final static File XSLTFile = Config.inputFile ( "books.html.xslt" );
    private final static File PXSLTFile = Config.inputFile ( "books.html.pxslt" );
    private final static File HTMLFile = Config.outputFile ( "books.html" );

    public static void transformXMLWithXML() throws Exception {

        logMessage ( XMLFile, XSLTFile, HTMLFile );

        XSLTTransformer.transformXMLWithXMLXSLT (
            new FileReader ( XMLFile ),
            new FileReader ( XSLTFile ),
            new FileWriter ( HTMLFile ) );
    }

    public static void transformPXMLWithPXML() throws Exception {

        logMessage ( PXMLFile, PXSLTFile, HTMLFile );

        XSLTTransformer.transformPXMLFileWithPXMLXSLTFile ( PXMLFile, PXSLTFile, HTMLFile );
    }

    public static void transformPXMLWithPXML_ArticleExample() throws Exception {

        XSLTTransformer.transformPXMLFileWithPXMLXSLTFile (
            new File ( "input/books.pxml" ),
            new File ( "input/books.pxslt" ),
            new File ( "output/books.html" ) );
    }

    static void logMessage ( File dataFile, File templateFile, File resultFile ) {

        System.out.println();
        System.out.println ( "Transforming" );
        System.out.println ( "     data: " + Utilities.fileMessage ( dataFile ) );
        System.out.println ( " template: " + Utilities.fileMessage ( templateFile ) );
        System.out.println ( "   result: " + Utilities.fileMessage ( resultFile ) );
    }
}
