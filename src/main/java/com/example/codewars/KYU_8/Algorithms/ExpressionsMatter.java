package com.example.codewars.KYU_8.Algorithms;

public class ExpressionsMatter {
    public static void main(String[] args) {
        System.out.println(ExpressionsMatter.expressionsMatter(1, 10, 1));
    }

    public static int expressionsMatter(int a, int b, int c) {
        int max=0;
        if (a*(b+c)>max)
            max=a*(b+c);
        if (a*b*c>max)
            max=a*b*c;
        if (a+b*c>max)
            max=a+b*c;
        if (a+b+c>max)
            max=a+b+c;
        if ((a+b)*c>max)
            max=(a+b)*c;

        return max;
    }
}
