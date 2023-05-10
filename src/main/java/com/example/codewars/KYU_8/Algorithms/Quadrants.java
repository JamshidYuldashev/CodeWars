package com.example.codewars.KYU_8.Algorithms;

public class Quadrants {
    public static void main(String[] args) {
        System.out.println(Quadrants.quadrant(  19, -56));
    }
    public static int quadrant(int x, int y) {
        int ans=0;
        if (x>0 && y>0)
            ans=1;
        else if (x<0 && y>0)
            ans=2;
        else if (x<0 && y<0)
            ans=3;
        else if (x>0 && y<0)
            ans=4;

        return ans;
    }
}
