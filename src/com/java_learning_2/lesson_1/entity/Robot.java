package com.java_learning_2.lesson_1.entity;

import com.java_learning_2.lesson_1.interfaces.Members;

public class Robot implements Members {

    private final String name;
    private final int distance;
    private final int height;

    public Robot(String name, int distance, int height) {
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
    public int distance() {
        return distance;
    }

    public String infoRobot() {
        return  "Робот " + this.name + " прыгает на " + height() + " метра в высоту и может пробежать " + distance() + " метров";
    }

    public String infoRobotJump() {
        return  "Робот " + name() + " прыгает на " + height() + " метра в высоту";
    }

    public String infoRobotRun() {
        return  "Робот " + name() + " может пробежать " + distance() + " метров";
    }

}
