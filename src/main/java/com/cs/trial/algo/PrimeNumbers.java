package com.cs.trial.algo;

public class PrimeNumbers {

    public static void main(String[] args) {
        int start = 0;
        int end = 100;
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.printPrimeNumbers(start, end);
    }

    /*This method calculates the prime numbers.
     */
    private void printPrimeNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            boolean flag = false;
            flag = isPrimeNumber(i, flag);
            if (flag == false) {
                System.out.println(i);
            }
        }

    }

    /*Checks if the number is prime or not*/
    private static boolean isPrimeNumber(int i, boolean flag) {
        if (i == 0 || i == 1) {
            return true;
        }
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
