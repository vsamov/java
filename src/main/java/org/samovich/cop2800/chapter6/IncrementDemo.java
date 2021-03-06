package org.samovich.cop2800.chapter6;

/**
 * Filename IncrementDemo.java
 * Created by Valery Samovich
 * Written on 5/31/16
 */
public class IncrementDemo {
    public static void main(String[] args) {
        int myNumber, answer;
        myNumber = 17;

        System.out.println("Before incrementing, myNumber is " + myNumber);
        answer = ++myNumber;
        System.out.println("After prefix increment, myNumber is " + myNumber);
        System.out.println("    and answer is " + answer);
        myNumber = 17;
        System.out.println("Before incrementing, myNumber is " + myNumber);
        answer = myNumber++;
        System.out.println("After postfix increment, myNumber is " + myNumber);
        System.out.println("    and answer is " + answer);
    }
}
