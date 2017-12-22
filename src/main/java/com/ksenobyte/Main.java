package com.ksenobyte;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calculate(2, n));
    }

    private static double calculate(int l, int n) {
        double result = Math.sin(l) / (Math.pow(l - 1., 2));
        if (l == n) {
            return result;
        }
        return result * calculate(++l, n);
    }
}
