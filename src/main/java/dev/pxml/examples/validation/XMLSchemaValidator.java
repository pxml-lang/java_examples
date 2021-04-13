package dev.pxml.examples.validation;

import dev.pxml.core.utilities.PXMLToXMLConverter;
import dev.pxml.core.utilities.XMLUtilities;
import dev.pxml.examples.Config;
import dev.pxml.examples.Utilities;
import org.w3c.dom.Document;

import javax.xml.XMLConstants;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;

public class XMLSchemaValidator {

    private final static File XMLFile = Config.inputFile ( "books.xml" );
    private final static File PXMLFile = Config.inputFile ( "books.pxml" );
    private final static File XMLSchemaFile = Config.inputFile ( "books.xsd" );
    private final static File PXMLSchemaFile = Config.inputFile ( "books.pxsd" );

    public static void validateWithXMLAndXML() throws Exception {

        logMessage ( XMLFile, XMLSchemaFile );

        validateDocumentWithSchemaDocument (
            XMLUtilities.XMLFileToXMLDocument ( XMLFile ),
            XMLUtilities.XMLFileToXMLDocument ( XMLSchemaFile ) );
    }

    public static void validateWithPXMLAndXML() throws Exception {

        logMessage ( PXMLFile, XMLSchemaFile );

        validateDocumentWithSchemaDocument (
            PXMLToXMLConverter.PXMLFileToXMLDocument ( PXMLFile ),
            XMLUtilities.XMLFileToXMLDocument ( XMLSchemaFile ) );
    }

    public static void validateWithPXMLAndPXML() throws Exception {

        logMessage ( PXMLFile, PXMLSchemaFile );

        validateDocumentWithSchemaDocument (
            PXMLToXMLConverter.PXMLFileToXMLDocument ( PXMLFile ),
            PXMLToXMLConverter.PXMLFileToXMLDocument ( PXMLSchemaFile ) );
    }

    public static void validateDocumentWithSchemaDocument ( Document XMLDocument, Document XMLSchemaDocument )
        throws Exception {

        SchemaFactory factory = SchemaFactory.newInstance ( XMLConstants.W3C_XML_SCHEMA_NS_URI );
        Schema schema = factory.newSchema ( new DOMSource ( XMLSchemaDocument ) );
        Validator validator = schema.newValidator();
        validator.validate ( new DOMSource ( XMLDocument ) );
    }

    static void logMessage ( File data, File schema ) {

        System.out.println();
        System.out.println ( "Validating" );
        System.out.println ( "     data: " + Utilities.fileMessage ( data ) );
        System.out.println ( "   schema: " + Utilities.fileMessage ( schema ) );
    }
}
