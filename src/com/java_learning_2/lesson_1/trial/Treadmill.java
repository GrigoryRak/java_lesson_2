package com.java_learning_2.lesson_1.trial;

import com.java_learning_2.lesson_1.interfaces.Run;

public class Treadmill implements Run {

    private final String model;
    private final int distance;

    public Treadmill (String model, int distance){
        this.model = model;
        this.distance = distance;
    }

    @Override
    public int distance() {
        return distance;
    }

    public String infoTreadmill() {
        return  "На беговой дорожке " + this.model + " можно пробежать дистанцию " + distance() + " метров за одну тренировку";
    }

}
