package com.cs.trial.algo;

public class FibonacciAlgo {
    public static void main(String[] args) {
        FibonacciAlgo fibonacciAlgo = new FibonacciAlgo();
        int start = 0;
        int end = 10;
        fibonacciAlgo.printFIbonacciSeries(start, end);
    }

    private void printFIbonacciSeries(int start, int end) {
        //0 1 1 2 3 5 8 13 21 34
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        System.out.print(n1 + " " + n2);
        if (end > 2) {
            for (int i = start; i < end - 2; i++) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                System.out.print(" " + n3);
            }
        }
    }
}
