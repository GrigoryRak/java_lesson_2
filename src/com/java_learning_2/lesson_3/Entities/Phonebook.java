package com.java_learning_2.lesson_3.Entities;

import java.security.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Phonebook {

    String surname;
    long phoneNumber;
    Map <String, Long> phonebookMaps = new HashMap<>();

    public String getSurname() {
        return surname;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

//    Добавляем абонента
    public void addSubscriber(String surname, long phoneNumber){
        phonebookMaps.put(surname, phoneNumber);

    }

//    Ищем абонента
    public void seachSubscriber(String surname){
        for (Map.Entry<String, Long> entry:phonebookMaps.entrySet()){
            System.out.println("Фамилия : " + entry.getKey().equals(surname) + " / Телефон: " + entry.getValue());
        }
    }

//    Печатаем справочник
    public void printPhonebook(){
        for (Map.Entry<String, Long> entry:phonebookMaps.entrySet()){
            System.out.println("Фамилия : " + entry.getKey() + " / Телефон: " + entry.getValue());
        }
    }
}
