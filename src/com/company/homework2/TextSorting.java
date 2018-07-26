package com.company.entity.homework2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Task C:
Все слова текста рассортировать в порядке убывания их длин,
при этом все слова одинаковой длины рассортировать в порядке возрастания в них гласных букв. */

public class TextSorting {
    public void sortText(String inputString) {
        String[] arrayWords = inputString.split("[^А-Яа-я]+");
        String temp;
        for (int i = 0; i<arrayWords.length ;i++){
            for (int k = 0; k < arrayWords.length; k++) {
                if (arrayWords[i].length() > arrayWords[k].length()) {
                    temp = arrayWords[i];
                    arrayWords[i] = arrayWords[k];
                    arrayWords[k] = temp;
                } else if (arrayWords[i].length() == arrayWords[k].length()) {
                    int countA = countLetter(arrayWords[i]);
                    int countB = countLetter(arrayWords[k]);
                    if (countA < countB) {
                        temp = arrayWords[i];
                        arrayWords[i] = arrayWords[k];
                        arrayWords[k] = temp;
                    }
                }
            }
        }
        for(int i = 0;i<arrayWords.length;i++){
            System.out.println(arrayWords[i]);
        }
    }

    private int countLetter(String str) {
        Pattern pattern = Pattern.compile("[уеыаоэяию]");
        int count = 0;
        Matcher matcher1 = pattern.matcher(str);
        while (matcher1.find()) {
            count++;
        }
        return count;
    }
}

