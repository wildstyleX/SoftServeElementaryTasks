package com.softserve.artem.task_4;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("./src/main/resources/java.txt");
            myWriter.write("Java is a class-based, object-oriented programming language");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
