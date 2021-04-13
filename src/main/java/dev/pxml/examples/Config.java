package dev.pxml.examples;

import java.io.File;
import java.nio.file.Path;

public class Config {

    public static String workingDirectory = System.getProperty ( "user.dir" );
    public static Path inputDirectoryPath = Path.of ( workingDirectory, "input" );
    public static Path outputDirectoryPath = Path.of ( workingDirectory, "output" );

    public static File inputFile ( String relativePath ) {
        return Path.of ( inputDirectoryPath.toString(), relativePath ).toFile();
    }

    public static File outputFile ( String relativePath ) {
        return Path.of ( outputDirectoryPath.toString(), relativePath ).toFile();
    }
}
