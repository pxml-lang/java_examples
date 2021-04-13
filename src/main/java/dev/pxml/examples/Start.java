package dev.pxml.examples;

import dev.pxml.examples.pxml_xml.PXMLToXMLExamples;
import dev.pxml.examples.pxml_xml.XMLToPXMLExamples;
import dev.pxml.examples.transformation.XMLTransformer;
import dev.pxml.examples.validation.XMLSchemaValidator;

public class Start {

    public static void main ( String[] args ) {

        System.out.println ( "Running examples" );

        try {
            // PXML to XML
            PXMLToXMLExamples.helloWorld();
            PXMLToXMLExamples.loginForm();

            // XML to PXML
            XMLToPXMLExamples.helloWorld();
            XMLToPXMLExamples.loginForm();

            // validate
            XMLSchemaValidator.validateWithXMLAndXML();
            XMLSchemaValidator.validateWithPXMLAndXML();
            XMLSchemaValidator.validateWithPXMLAndPXML();

            // transform
//            XMLTransformer.transformWithXMLAndXSLT();
            XMLTransformer.transformWithPXMLAndPXSLT();

        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}
