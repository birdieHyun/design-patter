package org.example.section3.templatemethod;

import java.io.BufferedReader;

public class FileProcessor {

    private String path;

    public FileProcessor(String path) {
        this.path = path;
    }

    public int process() {
        try (BufferedReader br =new BufferedReader(new java.io.FileReader(path))) {
            int result = 0;
            String line = null;
            while ((line = br.readLine()) != null) {
                result += Integer.parseInt(line);
            }

            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
