package com.example.codewars.KYU_8.Algorithms;

import java.util.Arrays;

public class MyHeadIsAtTheWrongEnd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(MyHeadIsAtTheWrongEnd.fixTheMeerkat(new String[]{ "lower legs", "torso", "upper legs"})));
    }

    public static String[] fixTheMeerkat(String[] arr) {
        String first = arr[0];
        String lost = arr[2];
        arr[0]=lost;
        arr[2]=first;
        return arr;
    }
}
