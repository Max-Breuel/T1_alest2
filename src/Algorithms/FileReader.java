package Algorithms;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReader {

    Monkeys monkeys = new Monkeys();

    public void fileReader(String fileName) {
        Path path = Paths.get(fileName);
        try (BufferedReader reader = Files.newBufferedReader(path, Charset.defaultCharset())) {
            String line = null;
            String numRounds = reader.readLine();
            while (reader.readLine() != null) {
                line = reader.readLine();
                line = line.replaceAll("[^0-9]", " ");
                String[] monkeyInfo = line.trim().split(" ");
                monkeys.addMonkey(monkeyInfo);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
