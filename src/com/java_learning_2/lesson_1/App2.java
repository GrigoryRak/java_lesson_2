package com.java_learning_2.lesson_1;

import com.java_learning_2.lesson_1.entity.Cat;
import com.java_learning_2.lesson_1.entity.Human;
import com.java_learning_2.lesson_1.entity.Robot;
import com.java_learning_2.lesson_1.interfaces.Lets;
import com.java_learning_2.lesson_1.interfaces.Members;
import com.java_learning_2.lesson_1.trial.Treadmill;
import com.java_learning_2.lesson_1.trial.Wall;

public class App2 {
    public static void main(String[] args) {

        Members[] members = new Members[3];
        Lets[] lets = new Lets[2];

        members[0] = new Cat("Барсик", 1001, 2);
        members[1] = new Human("Андрей", 990, 1);
        members[2] = new Robot("T1000", 900, 4);

        lets[0] = new Treadmill(1000);
        lets[1] = new Wall(2);



//        for (int i = 0; i < members.length; i++) {
//            System.out.println();
//            System.out.println("----------------------Характеристика испытуемого----------------------");
//            System.out.println(members[i].info(members[i].name(), members[i].distance(), members[i].height()));
//            System.out.println("----------------------Тестирование испытуемого----------------------");
//            for (int j = 0; j < lets.length; j++) {
//                if (lets[j].distance() >= members[i].distance()) {
//                    System.out.println(members[i].name() + " пробежал растояние " + members[i].distance());
//                    if (members[i].height() >= lets[j + 1].height()) {
//                        System.out.println(members[i].name() + " перепрыгнул стену высотой " + lets[j + 1].height() + " метр");
//                    } else {
//                        System.out.println(members[i].name() + " выбыл из теста");
//                        break;
//                    }
//                } else {
//                    System.out.println(members[i].name() + " выбыл из теста");
//                    break;
//                }
//            }
//        }

//        Использование массива с конкретным индексом
//        for (Members member : members) {
//            System.out.println();
//            System.out.println("----------------------Характеристика испытуемого----------------------");
//            System.out.println(member.info(member.name(), member.distance(), member.height()));
//            System.out.println("----------------------Тестирование испытуемого----------------------");
//            if (lets[0].distance() >= member.distance()) {
//                System.out.println(member.name() + " пробежал растояние " + member.distance());
//                if (member.height() >= lets[1].height()) {
//                    System.out.println(member.name() + " перепрыгнул стену высотой " + lets[1].height() + " метр");
//                } else {
//                    System.out.println(member.name() + " выбыл из теста");
//                }
//            } else {
//                System.out.println(member.name() + " выбыл из теста");
//            }
//        }

    }
}
