package dev.pxml.examples;

import java.io.File;

public class Utilities {

    public static String fileMessage ( File file ) {
        return file.getName() + " in " + file.getParent();
    }
}
