package com.example.codewars.KYU_8.Algebra;

public class FindTheSlope_8_KYU {
    public static void main(String[] args) {
        FindTheSlope_8_KYU findTheSlope8Kyu = new FindTheSlope_8_KYU();
        System.out.println(findTheSlope8Kyu.slope(new int[]{10,20,20,80}));
    }

    public String slope(int[] points) {
        return points[2] - points[0] != 0 ? String.valueOf((points[3] - points[1])/(points[2] - points[0])) : "undefined";
    }
}
