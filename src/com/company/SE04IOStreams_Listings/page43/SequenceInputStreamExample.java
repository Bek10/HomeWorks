package com.epam.SE04IOStreams.page43;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamExample {
    public static void main(String[] args) {
        FileInputStream inFile1 = null;
        FileInputStream inFile2 = null;
        SequenceInputStream sequenceStream = null;
        FileOutputStream outFile = null;
        try {
            inFile1 = new FileInputStream("file 1.txt");
            inFile2 = new FileInputStream("file 2.txt");
            sequenceStream = new SequenceInputStream(inFile1, inFile2);
            outFile = new FileOutputStream("file 3.txt");
            int readedByte = sequenceStream.read();
            while (readedByte != -1) {
                outFile.write(readedByte);
                readedByte = sequenceStream.read();
            }
        }
        catch (IOException e) {
            System.out.println("IOException: " + e.toString());
        } finally {
            try {
                sequenceStream.close();
            } catch (IOException | NullPointerException e) {
            }
            try {
                outFile.close();
            } catch (IOException | NullPointerException e) {
            }
        }
    }
}