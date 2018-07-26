package com.company.entity.homework2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String inputString = "эним  решеним выолядело нелееим\n" +
                "но гомасупо субботним вечеоер магазиое уже были закрыты," +
                " и единственным растворимыи в бпрзине красителем еоинсвоенным.";
        TextSorting text = new TextSorting();
        text.sortText(inputString);

        WordInsertion word = new WordInsertion();
        word.insertWord(inputString);

        WordDeletion deletion = new WordDeletion();
        System.out.println((deletion.deleteWords(inputString, 7)));
    }
}