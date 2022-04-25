package com.java_learning_2.lesson_5.Methods;

public class ArrayActions {

    public float[] initializationArray(int sizeArray){
        float[] initialArray = new float[sizeArray];
        for (int i = 0; i < initialArray.length; i++) {
            initialArray[i] = 1.0f;
        }
        return initialArray;
    }

}
