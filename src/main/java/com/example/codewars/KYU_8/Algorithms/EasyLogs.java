package com.example.codewars.KYU_8.Algorithms;

public class EasyLogs {
    public static void main(String[] args) {

        System.out.println(EasyLogs.logs(1000, 2, 3));
    }
    public static double logs(double x, double a, double b) {
        return Math.log(a) / Math.log(x) + Math.log(b) / Math.log(x);
    }
}
