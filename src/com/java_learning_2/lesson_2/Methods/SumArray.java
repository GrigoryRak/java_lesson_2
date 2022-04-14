package com.java_learning_2.lesson_2.Methods;

import com.java_learning_2.lesson_2.Exceptions.MyArrayDataException;

public class SumArray extends CheckSizeArray {

    public static int sumArray(String[][] array, int arraySize) {
        checkSizeArray(array, arraySize);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            String[] row = array[i];
            for (int j = 0; j < array.length; j++) {
                String value = row[j];
                try {
                    sum += Integer.parseInt(value);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
