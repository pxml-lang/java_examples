package dev.pxml.examples;

import dev.pxml.examples.pxml_xml.PXMLToXMLExamples;
import dev.pxml.examples.pxml_xml.XMLToPXMLExamples;
import dev.pxml.examples.transformer.XSLTTransformerExamples;
import dev.pxml.examples.validator.XMLSchemaValidatorExamples;

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
            XMLSchemaValidatorExamples.validateXMLWithXML();
            XMLSchemaValidatorExamples.validateXMLWithPXML();
            XMLSchemaValidatorExamples.validatePXMLWithXML();
            XMLSchemaValidatorExamples.validatePXMLWithPXML();

            // transform
            XSLTTransformerExamples.transformXMLWithXML();
            XSLTTransformerExamples.transformPXMLWithPXML();

        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}
