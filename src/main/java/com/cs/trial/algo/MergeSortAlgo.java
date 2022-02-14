package com.cs.trial.algo;

import java.util.Arrays;

public class MergeSortAlgo {

    private void merge(int arr[], int left, int mid, int right) {

        // Find sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        /* Create temp arrays */
        int leftTemp[] = new int[n1];
        int rightTemp[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            leftTemp[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightTemp[j] = arr[mid + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = left;
        while (i < n1 && j < n2) {
            if (leftTemp[i] <= rightTemp[j]) {
                arr[k++] = leftTemp[i++];
            } else {
                arr[k++] = rightTemp[j++];
            }
        }

        /* Copy remaining elements of leftTemp[] if any */
        while (i < n1) {
            arr[k++] = leftTemp[i++];
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k++] = rightTemp[j++];
        }
    }

    private void sort(int arr[], int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Sort first and second halves
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int inputArr[] = {38, 27, 43, 3, 9, 82, 10};
        MergeSortAlgo msa = new MergeSortAlgo();
        msa.sort(inputArr, 0, inputArr.length - 1);
        Arrays.stream(inputArr).forEach(s -> System.out.print(s + " "));
    }
}
