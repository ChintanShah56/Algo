package com.cs.trial.algo;

import java.util.Arrays;

public class RotateArrayToRight {

    public static void main(String[] args) {
        int inputArr[] = {64, 34, 25, 12, 22, 11, 90};
        int rotateBy = 1;
        RotateArrayToRight rotateArrayToLeft = new RotateArrayToRight();
        rotateArrayToLeft.rotateToRightByN(inputArr, rotateBy);
    }

    private void rotateToRightByN(int[] inputArr, int rotateBy) {
        int temp = 0;
        for (int i = 0; i < rotateBy; i++) {
            rotateByOne(inputArr, temp);
        }
        System.out.println("Array after rotating elemet to right : " + rotateBy);
        Arrays.stream(inputArr).forEach(s -> System.out.print(s + " "));
    }

    private void rotateByOne(int[] inputArr, int temp) {
        temp = inputArr[inputArr.length - 1];
        for (int j = inputArr.length - 1; j > 0; j--) { //start from back
            inputArr[j] = inputArr[j - 1]; // inputArr[6] = inputArr[6-1]
        }
        inputArr[0] = temp;
    }
}
