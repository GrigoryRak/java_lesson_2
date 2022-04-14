package com.java_learning_2.lesson_2;

public class Test {

    public static void main(String[] args){
        String st = "5+3";
        int result;
        for(int i=0;i<st.length();i++)
        {
            if(st.charAt(i)=='+')
            {
                result=Integer.parseInt(st.substring(0, i))+Integer.parseInt(st.substring(i+1));
                System.out.print(result);
            }
        }
    }
}



