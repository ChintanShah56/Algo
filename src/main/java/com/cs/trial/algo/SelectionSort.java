package com.cs.trial.algo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int inputArr[] = {64, 25, 12, 22, 11};
        int sortedArr[] = selectionSort.sort(inputArr);

        Arrays.stream(inputArr).forEach(s -> System.out.print(s + " "));
    }

    public int[] sort(int[] inputArr) {
        for (int i = 0; i < inputArr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < inputArr.length; j++) {
                if (inputArr[j] < inputArr[min_index]) {
                    min_index = j;
                }
            }
            int temp = inputArr[min_index];
            inputArr[min_index] = inputArr[i];
            inputArr[i] = temp;

        }
        return inputArr;
    }
}
