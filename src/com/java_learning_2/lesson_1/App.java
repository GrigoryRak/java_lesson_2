package com.java_learning_2.lesson_1;

//        1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти
//        классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в
//        консоль).
//        2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
//        должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
//        печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//        3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
//        этот набор препятствий.
//        4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения
//        на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он
//        препятствий не идет.

import com.java_learning_2.lesson_1.entity.Cat;
import com.java_learning_2.lesson_1.entity.Human;
import com.java_learning_2.lesson_1.entity.Robot;
import com.java_learning_2.lesson_1.trial.Treadmill;
import com.java_learning_2.lesson_1.trial.Wall;

public class App {
    public static void main(String[] args){
        Cat barsik = new Cat("Барсик", 20, 2);
        Human andrey = new Human("Андрей", 20000, 2);
        Robot t1000 = new Robot("T1000", 50000, 4);

        Treadmill modelOne = new Treadmill("modelOne", 10000);
        Wall smallWall = new Wall(1);

        System.out.println(barsik.infoCat());
        System.out.println(andrey.infoHuman());
        System.out.println(t1000.infoRobot());
        System.out.println(modelOne.infoTreadmill());
        System.out.println(smallWall.infoWall());

    }
}
