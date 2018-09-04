package com.epam.SE04IOStreams.page96;

import java.util.Scanner;

public class FindInLineExample {
    public static void main(String args[]) {
        String instr = "Name: Joe Age: 28 ID: 77";
        Scanner conin = new Scanner(instr);
        conin.findInLine("Age:"); // find Age
        if (conin.hasNext())
            System.out.println(conin.next());
        else
            System.out.println("Error!");
    }
}
