package com.cs.trial.algo;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40, 20, 80, 30, 60, 50,
                110, 100, 130, 170};
        int elementToSearch = 130;
        BinarySearchAlgo binarySearchAlgo = new BinarySearchAlgo();
        int index = binarySearchAlgo.binarySearchRecursive(arr, 0, arr.length - 1, elementToSearch);
        if (index == -1) {
            System.out.println("binarySearchRecursive Element is not present in the given array");
        } else {
            System.out.println("binarySearchRecursive Element is present at index: " + index);
        }

        int iterativeIndex = binarySearchAlgo.binarySearchIterative(arr, 0, arr.length - 1, elementToSearch);
        if (iterativeIndex == -1) {
            System.out.println("binarySearchIterative Element is not present in the given array");
        } else {
            System.out.println("binarySearchIterative Element is present at index: " + iterativeIndex);
        }
    }

    private int binarySearchIterative(int[] arr, int left, int right, int elementToSearch) {
        while (right >= left) {
            int mid = left + (right - left) / 2;

            if (elementToSearch == arr[mid]) {
                return mid;
            }

            if (arr[mid] < elementToSearch) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private int binarySearchRecursive(int[] arr, int left, int right, int elementToSearch) {
        if (left <= right) {
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
