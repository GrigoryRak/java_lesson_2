package com.java_learning_2.lesson_2.Methods;

import com.java_learning_2.lesson_2.Exceptions.MyArrayDataException;

public class SumArray extends CheckSizeArray {

//    https://ru.stackoverflow.com/questions/778864/%D0%95%D1%81%D1%82%D1%8C-%D1%81%D1%82%D1%80%D0%BE%D0%BA%D0%B0-%D0%BA%D0%BE%D1%82%D0%BE%D1%80%D0%B0%D1%8F-%D1%81%D0%BE%D0%B4%D0%B5%D1%80%D0%B6%D0%B8%D1%82-%D1%82%D0%BE%D0%BB%D1%8C%D0%BA%D0%BE-%D0%B0%D1%80%D0%B8%D1%84%D0%BC%D0%B5%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%BE%D0%B5-%D0%B2%D1%8B%D1%80%D0%B0%D0%B6%D0%B5%D0%BD%D0%B8%D0%B5-%D0%9A%D0%B0%D0%BA-%D0%B5%D0%B3%D0%BE-%D0%BF%D0%BE%D1%81%D1%87%D0%B8%D1%82%D0%B0%D1%82%D1%8C

    public static int sumArray(String[][] array, int arraySize) {
        checkSizeArray(array, arraySize);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            String[] row = array[i];
            for (int j = 0; j < array.length; j++) {
                String value = row[j];
                System.out.println("Value = " + value);
                System.out.println(value.length());
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
