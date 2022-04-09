package com.java_learning_2.lesson_1.trial;

import com.java_learning_2.lesson_1.interfaces.Jump;

public class Wall implements Jump {

    private final int height;

    public Wall (int height){
        this.height = height;
    }

    @Override
    public int height() {
        return height;
    }

    public String infoWall() {
        return  "Стена высотой " + height() + " метр(а/ов)";
    }

}
