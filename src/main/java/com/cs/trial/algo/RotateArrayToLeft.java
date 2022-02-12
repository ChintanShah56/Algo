package com.cs.trial.algo;

import java.util.Arrays;

public class RotateArrayToLeft {

    public static void main(String[] args) {
        int inputArr[] = {64, 34, 25, 12, 22, 11, 90};
        int rotateBy = 2;
        RotateArrayToLeft rotateArrayToLeft = new RotateArrayToLeft();
        rotateArrayToLeft.rotateToLeftByN(inputArr, rotateBy);
    }

    private void rotateToLeftByN(int[] inputArr, int rotateBy) {
        int temp = 0;
        for (int i = 0; i < rotateBy; i++) {
            rotateByOne(inputArr, temp);
        }
        Arrays.stream(inputArr).forEach(s -> System.out.print(s + " "));
    }

    private void rotateByOne(int[] inputArr, int temp) {
        temp = inputArr[0];
        for (int j = 0; j < inputArr.length - 1; j++) {
            inputArr[j] = inputArr[j + 1];
        }
        inputArr[inputArr.length - 1] = temp;
    }
}
