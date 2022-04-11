package com.java_learning_2.lesson_1;

import com.java_learning_2.lesson_1.entity.Cat;
import com.java_learning_2.lesson_1.entity.Human;
import com.java_learning_2.lesson_1.entity.Robot;
import com.java_learning_2.lesson_1.interfaces.Lets;
import com.java_learning_2.lesson_1.interfaces.Members;
import com.java_learning_2.lesson_1.trial.Treadmill;
import com.java_learning_2.lesson_1.trial.Wall;

public class App4 {

    public static void main(String[] args) {
        Members barsik = new Cat("Барсик", 1000, 2);
        Members andrey = new Human("Андрей", 1000, 0);
        Members t1000 = new Robot("T1000", 1001, 4);

        Treadmill treadmill = new Treadmill(1000);
        Wall wall = new Wall(2);

        Members[] members = {barsik, andrey, t1000};
        Lets[] lets = {treadmill, wall};

        for (int i=0; i<members.length; i++){
            for (int y=0; y<lets.length; y++){
                System.out.println(lets[y].checkLets(members[i]));
            }
        }

    }

}
