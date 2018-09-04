package com.epam.SE04IOStreams.page11;

import java.io.IOException;
import java.io.OutputStream;

public class IOExceptionGenerate {
    public static void main(String[] args) {
        OutputStream stdout = System.out;
        try {
            stdout.write(104); // 'h'
            stdout.write(105); // 'i'
            stdout.write(10); // '\n'
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

