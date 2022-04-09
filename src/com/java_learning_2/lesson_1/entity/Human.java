package com.java_learning_2.lesson_1.entity;

import com.java_learning_2.lesson_1.interfaces.Jump;
import com.java_learning_2.lesson_1.interfaces.Run;

public class Human implements Jump, Run {

    private final String name;
    private final int distance;
    private final int height;

    public Human(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    @Override
    public int height() {
        return height;
    }

    @Override
    public int distance() {
        return distance;
    }

    public String infoHuman() {
        return  "Человек " + this.name + " прыгает на " + height() + " метра в высоту и может пробежать " + distance() + " метров";
    }

    public String infoHumanJump() {
        return  "Человек " + this.name + " прыгает на " + height() + " метра в высоту";
    }

    public String infoHumanRun() {
        return  "Человек " + this.name + " может пробежать " + distance() + " метров";
    }
}
