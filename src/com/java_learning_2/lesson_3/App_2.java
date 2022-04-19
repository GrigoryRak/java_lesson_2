package com.java_learning_2.lesson_3;

//2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
//   В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии.
//   Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
//   Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще
//   дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.).
//   Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main() прописывая add() и get().

import com.java_learning_2.lesson_3.Entities.Phonebook;

public class App_2 {

    public static void main(String[] args) {

        Phonebook.addSubscriber("+79036001000", "Ivanov");
        Phonebook.addSubscriber("+79036001001", "Ivanov");
        Phonebook.addSubscriber("+79036001002", "Ivanov");
        Phonebook.addSubscriber("+79036001003", "Ivanov");
        Phonebook.addSubscriber("+79036001004", "Ivanov");
        Phonebook.addSubscriber("+79036001005", "Ivanov");
        Phonebook.addSubscriber("+79036001006", "Ivanov");
        Phonebook.addSubscriber("+79036001007", "Ivanov");
        Phonebook.addSubscriber("+79036001008", "Ivanov");
        Phonebook.addSubscriber("+79036001009", "Petrov");
        Phonebook.addSubscriber("+79036001010", "Sidorov");
        Phonebook.addSubscriber("+79036001011", "Komarov");

        Phonebook.searchSubscriber("Ivanov");

//        Phonebook.printPhonebook();
    }
}
