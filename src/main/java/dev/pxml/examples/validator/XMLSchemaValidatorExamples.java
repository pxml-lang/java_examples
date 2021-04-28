package dev.pxml.examples.validator;

import dev.pxml.core.utilities.XMLSchemaValidator;
import dev.pxml.examples.Config;
import dev.pxml.examples.Utilities;

import java.io.File;
import java.io.FileReader;

public class XMLSchemaValidatorExamples {

    private final static File XMLFile = Config.inputFile ( "books.xml" );
    private final static File PXMLFile = Config.inputFile ( "books.pxml" );
    private final static File XMLSchemaFile = Config.inputFile ( "books.xsd" );
    private final static File PXMLSchemaFile = Config.inputFile ( "books.pxsd" );

    public static void validateXMLWithXML() throws Exception {

        logMessage ( XMLFile, XMLSchemaFile );

        XMLSchemaValidator.validateXMLDataWithXMLSchema (
            new FileReader ( XMLFile ), new FileReader ( XMLSchemaFile ) );
    }

    public static void validateXMLWithPXML() throws Exception {

        logMessage ( XMLFile, PXMLSchemaFile );

        XMLSchemaValidator.validateXMLDataWithPXMLSchema(
            new FileReader ( XMLFile ), new FileReader ( PXMLSchemaFile ), PXMLSchemaFile );
    }

    public static void validatePXMLWithXML() throws Exception {

        logMessage ( PXMLFile, XMLSchemaFile );

        XMLSchemaValidator.validatePXMLDataWithXMLSchema (
            new FileReader ( PXMLFile ), PXMLFile, new FileReader ( XMLSchemaFile ) );
    }

    public static void validatePXMLWithPXML() throws Exception {

        logMessage ( PXMLFile, PXMLSchemaFile );

        XMLSchemaValidator.validatePXMLFileWithPXMLSchemaFile ( PXMLFile, PXMLSchemaFile );
    }

    public static void validatePXMLWithPXML_ArticleExample() throws Exception {

        XMLSchemaValidator.validatePXMLFileWithPXMLSchemaFile (
            new File ( "input/books.pxml" ),
            new File ( "input/books.pxsd" ) );
    }

    static void logMessage ( File data, File schema ) {

        System.out.println();
        System.out.println ( "Validating" );
        System.out.println ( "     data: " + Utilities.fileMessage ( data ) );
        System.out.println ( "   schema: " + Utilities.fileMessage ( schema ) );
    }
}
