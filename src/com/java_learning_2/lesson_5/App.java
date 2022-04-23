package com.java_learning_2.lesson_5;

//    https://jenkov.com/tutorials/java-util-concurrent/java-callable.html
import com.java_learning_2.lesson_5.Methods.ArrayActions;
import com.java_learning_2.lesson_5.Methods.SplittingArrayThread;

public class App {

    static final int SIZE_ARRAY = 10;

    public static void main(String[] agrs) throws InterruptedException {

        SplittingArrayThread splittingArrayThread = new SplittingArrayThread();
        ArrayActions arrayActions = new ArrayActions();

        splittingArrayThread.firstMethod(arrayActions.initializationArray(SIZE_ARRAY));
        SplittingArrayThread.secondMethod(arrayActions.initializationArray(SIZE_ARRAY));

    }
}
