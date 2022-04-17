package com.java_learning_2.lesson_3;

//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//   Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.

import com.java_learning_2.lesson_3.Methods.FindDuplicates;

import java.util.*;

public class App_1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("раз", "два", "три", "четыре", "пять", "шесть", "семь", "восемь",
                "девять", "десять", "ноль", "раз", "три", "двадцать", "шестьдесят",
                "сто", "восемь", "ноль", "один", "семьдесят", "один", "семьдесят один", "четыре",
                "сорок шесть", "пятьдесят пять", "ноль", "раз", "два", "три", "восемь", "десять",
                "одинадцать", "пятнадцать", "тысяча", "миллион");

        System.out.println("Массив на вход: " + words);
        System.out.println("Дубликаты: " + FindDuplicates.findDuplicatesValues(words));
        System.out.println("Уникальные значения: " + FindDuplicates.findUniqueValues(words));
        System.out.println("--------------------------------------------------");
        FindDuplicates.countEntries(words);
    }


}
