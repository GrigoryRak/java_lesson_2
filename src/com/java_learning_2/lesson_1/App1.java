package com.java_learning_2.lesson_1;

import com.java_learning_2.lesson_1.entity.Cat;
import com.java_learning_2.lesson_1.entity.Human;
import com.java_learning_2.lesson_1.entity.Robot;
import com.java_learning_2.lesson_1.trial.Treadmill;
import com.java_learning_2.lesson_1.trial.Wall;

public class App1 {
    public static void main(String[] args){
        Cat barsik = new Cat("Барсик", 20, 2);
        Human andrey = new Human("Андрей", 1000, 0);
        Robot t1000 = new Robot("T1000", 1001, 4);

        Treadmill modelOne = new Treadmill(1000);
        Wall smallWall = new Wall(1);

        System.out.println(barsik.infoCat());
        System.out.println(andrey.infoHuman());
        System.out.println(t1000.infoRobot());
        System.out.println(modelOne.infoTreadmill());
        System.out.println(smallWall.infoWall());

        modelOne.checkDistance(barsik.distance());
        modelOne.checkDistance(andrey.distance());
        modelOne.checkDistance(t1000.distance());

        smallWall.checkWall(barsik.height());
        smallWall.checkWall(andrey.height());
        smallWall.checkWall(t1000.height());

    }
}
