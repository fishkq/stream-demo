package com.fish.createstream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author fish
 */
public class StreamFromFile {
    public static void main(String[] args) {
        new StreamFromFile().readFromFile("file.txt");
//        Path path = Paths.get("file.txt");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());
    }
    public void readFromFile(final String filePath) {
        try {
            Stream<String> lines = Files.lines(Paths.get(filePath));
            lines.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
