package com.java_learning_2.lesson_1;

import com.java_learning_2.lesson_1.entity.Cat;
import com.java_learning_2.lesson_1.entity.Human;
import com.java_learning_2.lesson_1.entity.Robot;
import com.java_learning_2.lesson_1.interfaces.Members;
import com.java_learning_2.lesson_1.trial.Treadmill;
import com.java_learning_2.lesson_1.trial.Wall;

public class App3 {

    public static void main(String[] args) {
        Members barsik = new Cat("Барсик", 1000, 2);
        Members andrey = new Human("Андрей", 1000, 0);
        Members t1000 = new Robot("T1000", 1001, 4);

        Treadmill treadmill = new Treadmill(1000);
        Wall wall = new Wall(2);

        testRun(treadmill, barsik, andrey, t1000);
        testJump(wall, barsik, andrey, t1000);

    }

    private static void testRun(Treadmill treadmill, Members... members) {
        for (Members member : members) {
            System.out.println(member);
            System.out.println(member.name() + " смог преодолеть дистанцию: " + treadmill.checkDistance2(member));
            System.out.println("---");
        }
    }

    private static void testJump(Wall wall, Members... members) {
        for (Members member : members) {
            System.out.println(member);
            System.out.println(member.name() + " смог преодолеть стену: " + wall.checkWall2(member));
            System.out.println("---");
        }
    }

}
