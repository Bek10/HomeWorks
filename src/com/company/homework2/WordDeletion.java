package com.company.entity.homework2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Task B:
Из текста удалить все слова заданной длины, начинающиеся на согласную букву.*/

public class WordDeletion {
    public StringBuilder deleteWords(String string,int lengthWord) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] array = string.split("[^А-Яа-я]");
        Pattern pattern = Pattern.compile("^[ЦКНРТГГДЖХЗЧСТБВПФцкнгшщзхфвпрлджчсмтб][а-я]?");
        for (String s : array) {
            Matcher matcher1 = pattern.matcher(s);
            if (s.length() == lengthWord) {
                if (matcher1.find()) {
                    continue;
                } else {
                    stringBuilder.append(s + " ");
                }
            } else {
                stringBuilder.append(s + " ");
            }
        }
        return stringBuilder;
    }
}

