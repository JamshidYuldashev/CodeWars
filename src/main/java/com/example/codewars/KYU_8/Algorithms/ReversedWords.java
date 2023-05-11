package com.example.codewars.KYU_8.Algorithms;

import java.util.Arrays;
import java.util.Collections;

public class ReversedWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("hello world!"));
    }
    public static String reverseWords(String str){
        // Split the string into words
        String[] words = str.split(" ");

        // Reverse the order of the words
        Collections.reverse(Arrays.asList(words));

        // Join the reversed words back into a string
        return String.join(" ", words);
    }
}
