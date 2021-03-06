package com.java_learning_2.lesson_1.entity;

import com.java_learning_2.lesson_1.interfaces.Members;

public class Cat implements Members {

    private final String name;
    private final int distance;
    private final int height;

    public Cat(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String info(String name, int distance, int height) {
        return "Кот " + name() + " прыгает на " + height() + " метра в высоту и может пробежать " + distance() + " метров";
    }

    @Override
    public int height() {
        return height;
    }

    @Override
    public int distance() {
        return distance;
    }

    public String infoCat() {
        return "Кот " + name() + " прыгает на " + height() + " метра в высоту и может пробежать " + distance() + " метров";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                ", height=" + height +
                '}';
    }
}
