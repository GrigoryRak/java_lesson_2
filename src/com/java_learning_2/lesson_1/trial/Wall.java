package com.java_learning_2.lesson_1.trial;

import com.java_learning_2.lesson_1.interfaces.Jump;
import com.java_learning_2.lesson_1.interfaces.Members;

public class Wall implements Jump {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int distance() {
        return 0;
    }

    @Override
    public int height() {
        return height;
    }

    public void checkWall(int mount) {
        if (mount >= height()) {
            System.out.println("Стену высотой " + height() + " метр(а/ов) преодолел без труда");
        } else {
            System.out.println("Слишком высоко препядствие");
        }
    }

    public boolean checkWall2(Members jumpCheck) {
        int checkMembersJump = jumpCheck.height();
        boolean b = checkMembersJump >= height;
        return b;
    }

    public String infoWall() {
        return "Стена высотой " + height() + " метр(а/ов)";
    }

}
