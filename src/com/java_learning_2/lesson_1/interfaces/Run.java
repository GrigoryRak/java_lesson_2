package com.java_learning_2.lesson_1.interfaces;

public interface Run extends Lets {
    int distance();

    @Override
    default boolean checkLets(Members members) {
        if (members.distance() >= distance()){
            return true;
        }
        return false;
    }
}
