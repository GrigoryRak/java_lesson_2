package com.java_learning_2.lesson_2.Exceptions;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(int row, int col){
        super(String.format("Некорректное значение в ячейке array[%d][%d]", row, col));
    }
}
