package com.example.codewars.KYU_8.Algorithms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CountTheMonkeys {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(CountTheMonkeys.monkeyCount(4)));
    }

    public static int[] monkeyCount(final int n){
       return IntStream.rangeClosed(1, n).toArray();
    }
}
