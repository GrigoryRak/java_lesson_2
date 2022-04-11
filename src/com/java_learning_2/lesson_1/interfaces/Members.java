package com.java_learning_2.lesson_1.interfaces;

//интерфейс участника, который умеет возвращать свои параметры прыжка, бега и тд

public interface Members {
    String name();
    int distance();
    int height();

    String info(String name, int distance, int height);
}
