package dev.pxml.examples;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Utilities {

    public static String fileMessage ( File file ) {
        return file.getName() + " in " + file.getParent();
    }


/*
    public static Document XMLFileToDocument ( File XMLFile )
        throws IOException, SAXException, ParserConfigurationException {

        DocumentBuilder parser = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        return parser.parse ( XMLFile );
    }
*/
}
