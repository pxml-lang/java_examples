package dev.pxml.examples.pxml_xml;

import dev.pxml.examples.Config;

import java.io.File;

import static dev.pxml.core.utilities.XMLToPXMLConverter.XMLFileToPXMLFile;

public class XMLToPXMLExamples {

    public static void helloWorld() throws Exception {
        XMLToPXML ( "hello.xml", "hello.pxml" );
    }

    public static void loginForm() throws Exception {
        XMLToPXML ( "login_form.xml", "login_form.pxml" );
    }

    private static void XMLToPXML ( String XMLPath, String PXMLPath ) throws Exception {

        File XMLFile = Config.inputFile ( XMLPath );
        File PXMLFile = Config.outputFile ( PXMLPath );

        PXMLToXMLExamples.logMessage ( XMLFile, PXMLFile );

        XMLFileToPXMLFile ( XMLFile, PXMLFile );
    }
}
