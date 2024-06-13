package org.example.section3.templatemethod;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("test.txt");
        int process = fileProcessor.process();
        System.out.println(process);
    }
}
