package com.java_learning_2.lesson_3.Entities;

import java.util.*;

public class Phonebook {

    private static final Map<String, String> phonebookMaps = new HashMap<>();
    private static final List<String> findSubs = new ArrayList<>();

    //    Добавляем абонента
    public static void addSubscriber(String phoneNumber, String surname) {
        phonebookMaps.put(phoneNumber, surname);
    }

    //    Ищем абонента по имени
    public static void searchSubscriber(String surname) {
        if (!Objects.equals(surname, "")) {
            for (Map.Entry<String, String> entry : phonebookMaps.entrySet()) {
                if (surname.equalsIgnoreCase(entry.getValue())) {
                    findSubs.add("Фамилия : " + entry.getValue() + " / Телефон: " + entry.getKey());
                }
            }
        } else {
            System.out.println("Не введена фамилия абонента");
        }
        if (findSubs.size() == 0) findSubs.add("Абонент с фамилией " + surname + " не найден");
        for (String findSub : findSubs) {
            System.out.println(findSub);
        }
    }

    //    Печатаем справочник
    public static void printPhonebook() {
        for (Map.Entry<String, String> entry : phonebookMaps.entrySet()) {
            System.out.println("Фамилия : " + entry.getValue() + " / Телефон: " + entry.getKey());
        }
    }
}
