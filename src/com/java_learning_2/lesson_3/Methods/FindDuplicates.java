package com.java_learning_2.lesson_3.Methods;

import java.util.*;

public class FindDuplicates {

    public static <E> List<E> findDuplicatesValues(List<E> list) {
        Set<E> duplicates = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            E e1 = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                if (i == j) continue;
                E e2 = list.get(j);
                if (e1.equals(e2)) {
                    duplicates.add(e2);
                }
            }
        }
        return new ArrayList<>(duplicates);
    }

    public static <E> List<E> findUniqueValues(List<E> list) {
        Set<E> uniqueValues = new HashSet<>(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < findDuplicatesValues(list).size(); j++) {
                if (list.get(i).equals(findDuplicatesValues(list).get(j))) {
                    uniqueValues.remove(list.get(i));
                }
            }
        }
        return new ArrayList<>(uniqueValues);
    }

    public static void countEntries(List<String> list) {
        Set<String> set = new HashSet<>();
        set.addAll(list);
        for (String name : set) {
            System.out.println(name + " : " + Collections.frequency(list, name));
        }
    }

}
