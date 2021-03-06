package com.java_learning_2.lesson_1.trial;

import com.java_learning_2.lesson_1.interfaces.Members;
import com.java_learning_2.lesson_1.interfaces.Run;

public class Treadmill implements Run {

    private final int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public int distance() {
        return distance;
    }

    @Override
    public int height() {
        return 0;
    }

    public void checkDistance(int mount) {
        if (distance() >= mount) {
            System.out.println("Пробежал");
        } else if (mount >= distance()) {
            System.out.println("Беговая дорожка не подходит для дистанции " + mount + " метров");
        } else {
            System.out.println("Не пробежал");
        }
    }

    public boolean checkDistance2(Members runCheck) {
        int checkMembersRun = runCheck.distance();
        boolean b = checkMembersRun >= distance;
        return b;
    }

    public String infoTreadmill() {
        return "На беговой дорожке можно пробежать дистанцию " + distance() + " метров за одну тренировку";
    }

}
