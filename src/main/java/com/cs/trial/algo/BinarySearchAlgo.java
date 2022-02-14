package com.cs.trial.algo;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int elementToSearch = 50;
        BinarySearchAlgo binarySearchAlgo = new BinarySearchAlgo();
        int index = binarySearchAlgo.binarySearchRecursive(arr, 0, arr.length - 1, elementToSearch);
        if (index == -1) {
            System.out.println("Element is not present in the given array");
        } else {
            System.out.println("Element is present at index: " + index);
        }
    }

    private int binarySearchRecursive(int[] arr, int left, int right, int elementToSearch) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (elementToSearch == arr[mid]) {
                return mid;
            }

            if (arr[mid] > elementToSearch) {
                return binarySearchRecursive(arr, left, mid - 1, elementToSearch);
            }

            return binarySearchRecursive(arr, mid + 1, right, elementToSearch);
        }
        return -1;
    }
}
