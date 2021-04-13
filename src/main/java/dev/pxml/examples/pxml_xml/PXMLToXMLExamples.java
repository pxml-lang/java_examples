package dev.pxml.examples.pxml_xml;

import dev.pxml.examples.Config;
import dev.pxml.examples.Utilities;

import static dev.pxml.core.utilities.PXMLToXMLConverter.PXMLFileToXMLFile;

import java.io.File;

public class PXMLToXMLExamples {

    public static void helloWorld() throws Exception {
        PXMLToXML ( "hello.pxml", "hello.xml" );
    }

    public static void loginForm() throws Exception {
        PXMLToXML ( "login_form.pxml", "login_form.xml" );
    }

    private static void PXMLToXML ( String PXMLPath, String XMLPath ) throws Exception {

        File PXMLFile = Config.inputFile ( PXMLPath );
        File XMLFile = Config.outputFile ( XMLPath );

        logMessage ( PXMLFile, XMLFile );

        PXMLFileToXMLFile ( PXMLFile, XMLFile );
    }

    static void logMessage ( File from, File to ) {

        System.out.println();
        System.out.println ( "Converting" );
        System.out.println ( "   from: " + Utilities.fileMessage ( from ) );
        System.out.println ( "     to: " + Utilities.fileMessage ( to ) );
    }
}
