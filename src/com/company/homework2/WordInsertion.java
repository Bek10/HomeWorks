package com.company.entity.homework2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Task A:
После каждого слова текста, заканчивающегося заданной подстрокой, вставить указанное слово.*/

public class WordInsertion {
    public void insertWord(String inputString) {
        Pattern pattern = Pattern.compile("[А-Яа-я]+им", Pattern.MULTILINE);
        String [] array = inputString.split("[^А-Яа-я]+");
        for (String word: array) {
            System.out.print(word + " ");
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                System.out.print(" ЕПАМ ");
            }
        }
    }
}


