package com.cs.trial.algo;

import java.util.Arrays;

public class MergeArraysAlgo {

    private static void mergeArrays(int[] arr1, int[] arr2, int arrLen1, int arrLen2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        while (i < arrLen1 && j < arrLen2) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < arrLen1) {
            arr3[k++] = arr1[i++];
        }
        while (j < arrLen2) {
            arr3[k++] = arr2[j++];
        }
    }

    public static void main(String[] args) {
        int arr1[] = {15, 3, 7, 5, 9, 11, 13, 1};
        int arr2[] = {2, 8, 10, 4, 6};

        //merge Arrays
        MergeSortAlgo msa = new MergeSortAlgo();
        int arr3[] = new int[arr1.length + arr2.length];
        mergeArrays(arr1, arr2, arr1.length, arr2.length, arr3);

        //sort the array
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr3);
        Arrays.stream(arr3).forEach(s -> System.out.print(s + " "));
    }
}
