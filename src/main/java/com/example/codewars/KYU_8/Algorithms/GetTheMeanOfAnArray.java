package com.example.codewars.KYU_8.Algorithms;

public class GetTheMeanOfAnArray {
    public static void main(String[] args) {
        System.out.println(GetTheMeanOfAnArray.getAverage(new int[]{1,1,1,1,1,1,1,2}));
    }

    public static int getAverage(int[] marks){
        int sum =0;
        for (int mark : marks)
            sum+=mark;

        return sum/marks.length;
    }
}
