package com.java_learning_2.lesson_2.Exceptions;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("Размер не соотвествует 4х4");
    }
}
