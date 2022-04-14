package com.java_learning_2.lesson_2;

import com.java_learning_2.lesson_2.Exceptions.MyArrayDataException;
import com.java_learning_2.lesson_2.Exceptions.MyArraySizeException;
import static com.java_learning_2.lesson_2.Methods.SumArray.sumArray;

public class App {

    public static final int ARRAY_SIZE = 4;

    public static final String[][] DATA = new String[][]{
            {"5+3", "2", "3", "4"},
            {"1", "25", "3", "0"},
            {"1", "2", "-83", "4"},
            {"1", "2", "3", "-200"}
    };

    public static void main(String[] main) {
        try {
            int sum = sumArray(DATA, ARRAY_SIZE);
            System.out.println("Сумма массива " + sum);
        } catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        }
        System.out.println();
    }


}
