package com.epam.SE04IOStreams.page56;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class InputStreamWriterExample {
    public static void main(String[] argv) throws Exception {
        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("outfilename.txt"),
                                                                                    "UTF8"));
        out.write("asdf");
        out.close();
    }
}

