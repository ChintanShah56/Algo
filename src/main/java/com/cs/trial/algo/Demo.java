package com.cs.trial.algo;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int inputArr[] = {64, 34, 25, 12, 22, 11, 90}; // 1st

        for (int i = 0; i < inputArr.length - 1; i++) {
            int min_number = i;
            for (int j = i + 1; j < inputArr.length; j++) {
                if (inputArr[j] < inputArr[min_number]) {
                    min_number = j; // 5
                }
            }
            int smallerNumer = inputArr[min_number];
            inputArr[min_number] = inputArr[i];
            inputArr[i] = smallerNumer;
        }
        Arrays.stream(inputArr).forEach(s -> System.out.print(s + " "));
    }
}
