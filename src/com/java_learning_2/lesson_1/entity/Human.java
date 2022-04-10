package com.java_learning_2.lesson_1.entity;

import com.java_learning_2.lesson_1.interfaces.Members;

public class Human implements Members {

    private final String name;
    private final int distance;
    private final int height;

    public Human(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int height() {
        return height;
    }

    @Override
    public String info(String name, int distance, int height) {
        return "Человек " + name() + " прыгает на " + height() + " метра в высоту и может пробежать " + distance() + " метров";
    }

    @Override
    public int distance() {
        return distance;
    }

    public String infoHuman() {
        return "Человек " + name() + " прыгает на " + height() + " метра в высоту и может пробежать " + distance() + " метров";
    }

}
