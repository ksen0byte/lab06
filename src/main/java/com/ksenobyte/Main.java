package com.ksenobyte;

public class Main {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(calculate(1, n));
    }

    private static double calculate(int a, int n) {
        double result = (Math.pow(a, 2)) / (Math.exp(a) - Math.exp(-a));
        if (a == n) {
            return result;
        }
        return result + calculate(++a, n);
    }
}
