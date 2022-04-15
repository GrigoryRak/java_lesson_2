package com.java_learning_2.lesson_2.Methods;

import com.java_learning_2.lesson_2.Exceptions.MyArraySizeException;

public class CheckSizeArray {

    protected static void checkSizeArray(String[][] array, int arraySize) {
        if (array.length != arraySize) {
            throw new MyArraySizeException();
        }
        for (String[] row : array) {
            if (row.length != arraySize) {
                throw new MyArraySizeException();
            }
        }
    }
}
