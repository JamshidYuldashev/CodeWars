package com.example.codewars.KYU_8.Algorithms;

public class ConvertToBinary {
    public static void main(String[] args) {
        System.out.println(ConvertToBinary.toBinary(11));
    }

    public static int toBinary(int n) {
        return Integer.valueOf(Integer.toBinaryString(n));
    }
}
