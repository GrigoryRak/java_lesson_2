package com.java_learning_2.lesson_1;

//        1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти
//        классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в
//        консоль).
//        2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
//        должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
//        печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//        3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
//        этот набор препятствий.
//        4. У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения
//        на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он
//        препятствий не идет.

import com.java_learning_2.lesson_1.entity.Cat;
import com.java_learning_2.lesson_1.entity.Human;
import com.java_learning_2.lesson_1.entity.Robot;
import com.java_learning_2.lesson_1.interfaces.Lets;
import com.java_learning_2.lesson_1.interfaces.Members;
import com.java_learning_2.lesson_1.trial.Treadmill;
import com.java_learning_2.lesson_1.trial.Wall;

public class App {
    public static void main(String[] args) {

        Members[] members = new Members[3];
        Lets[] lets = new Lets[2];

        members[0] = new Cat("Барсик", 20, 1);
        members[1] = new Human("Андрей", 990, 3);
        members[2] = new Robot("T1000", 900, 4);

        lets[0] = new Treadmill(1000);
        lets[1] = new Wall(2);


//        System.out.println("----------------------Характеристика испытуемых----------------------");
//        System.out.println(barsik.infoCat());
//        System.out.println(andrey.infoHuman());
//        System.out.println(t1000.infoRobot());
//        System.out.println("----------------------Характеристика препядствий----------------------");
//        System.out.println(modelOne.infoTreadmill());
//        System.out.println(smallWall.infoWall());
//        System.out.println("----------------------Тестирование бегом----------------------");


        for (int i = 0; i < members.length; i++) {
            for (int j = 0; j < lets.length; j++) {
                if (lets[j].distance() >= members[i].distance()) {
                    System.out.println(members[i].name() + " пробежал растояние " + members[i].distance());
                    if (members[i].height() > lets[j].height()) {
                        System.out.println(members[i].name() + " перепрыгнул стену высотой " + lets[j].height());
                    } else {
//                        System.out.println(members[i].name() + " не смог перепрыгнул стену высотой " + members[j].height());
                        break;
                    }
                } else {
                    break;
                }
            }
        }

    }
}
