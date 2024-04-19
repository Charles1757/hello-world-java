package com.example;

import java.util.ArrayList;
import java.util.List;

public class FibonacciGenerator {

    public static List<Integer> generateFibonacciSeries(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The input cannot be negative");
        }

        List<Integer> fibonacciList = new ArrayList<>();

        if (n == 0) {
            return fibonacciList;
        }

        fibonacciList.add(0);
        if (n == 1) {
            return fibonacciList;
        }

        fibonacciList.add(1);
        for (int i = 2; i < n; i++) {
            int nextFibNumber = fibonacciList.get(i - 1) + fibonacciList.get(i - 2);
            fibonacciList.add(nextFibNumber);
        }

        return fibonacciList;
    }
}