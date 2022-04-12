package com.java_learning_2.lesson_1.interfaces;

public interface Jump extends Lets {
    int height();

    @Override
    default boolean checkLets(Members members) {
        if (members.height() >= height()){
            return true;
        }
        return false;
    }
}
