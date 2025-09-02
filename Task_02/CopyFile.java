// package Task_02;

import java.io.*;

public class CopyFile {
    // package FileOfJava;
    public static void main(String[] args) {
        try {
            // Create source file
            File textFile = new File("source.text");
            if (textFile.createNewFile()) {
                System.out.println("First File Created ");
            } else {
                System.out.println("File Alraedy exists");
            }

            // Write data into text file
            FileWriter writer = new FileWriter(textFile);
            writer.write("Hello, this is sample content.\nFile handling in Java is powerful!");
            writer.close();

            // Create second file
            File secondFile = new File("second.txt");
            if (secondFile.createNewFile()) {
                System.out.println("Second File created");
            } else {
                System.out.println("File already exists.");
            }

            // Copy content from textFile to secondFile
            FileReader fr = new FileReader(textFile);
            FileWriter fw = new FileWriter(secondFile);
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
            fr.close();
            fw.close();
            System.out.println("Data copied successfully from first file to second file");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
