package com.example.codewars.KYU_8.Algorithms;

public class MpgToKPM {
    public static void main(String[] args) {
        System.out.println(MpgToKPM.mpgToKPM(30));
    }
    public static float mpgToKPM(final float mpg) {
        float kpl = (float) ((mpg * 1.609344) / 4.54609188);
        kpl = (float) (Math.round(kpl * 100.0)/ 100.0);
        return kpl;
    }
}
