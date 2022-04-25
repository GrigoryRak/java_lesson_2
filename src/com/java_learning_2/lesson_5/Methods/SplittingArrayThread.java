package com.java_learning_2.lesson_5.Methods;

import java.util.Arrays;

public class SplittingArrayThread {

    public void firstMethod(float[] array) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread time: " + (System.currentTimeMillis() -
                startTime) + " ms.");
    }

    public static void secondMethod(float[] array) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        float[] firstHalArray = Arrays.copyOfRange(array, 0, array.length / 2);
        float[] secondHalfArray = Arrays.copyOfRange(array, array.length / 2, array.length);

        Thread threadFirstHalArray = new Thread(() -> {
            for (int i = 0; i < firstHalArray.length; i++) {
                firstHalArray[i] = (float) (firstHalArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread threadSecondHalfArray = new Thread(() -> {
            for (int i = 0; i < secondHalfArray.length; i++) {
                secondHalfArray[i] = (float) (secondHalfArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        threadFirstHalArray.start();
        threadSecondHalfArray.start();
        threadFirstHalArray.join();
        threadSecondHalfArray.join();

//        System.out.println(Arrays.toString(firstHalArray));
//        System.out.println(Arrays.toString(secondHalfArray));

        float[] unionArray = array;
        System.arraycopy(firstHalArray, 0, unionArray, 0, array.length / 2 );
        System.arraycopy(secondHalfArray, 0, unionArray, array.length / 2, array.length / 2 );

//        System.out.println(Arrays.toString(unionArray));

        System.out.println("Two thread time: " + (System.currentTimeMillis() -
                startTime) + " ms.");
    }

}
