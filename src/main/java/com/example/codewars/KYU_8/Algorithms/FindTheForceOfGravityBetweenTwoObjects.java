package com.example.codewars.KYU_8.Algorithms;

public class FindTheForceOfGravityBetweenTwoObjects {
    public static void main(String[] args) {
        double[] arr_val = {1000, 1000, 100};
        String[] arr_unit = {"kg", "kg", "m"};
        System.out.println(FindTheForceOfGravityBetweenTwoObjects.solution(arr_val, arr_unit));
    }
    public static double solution(double[] arrVal, String[] arrUnit) {
        double mass1 = convertToKilogram(arrVal[0], arrUnit[0]);
        double mass2 = convertToKilogram(arrVal[1], arrUnit[1]);

        double distance = convertToMeter(arrVal[2], arrUnit[2]);

        final double G =  6.67E-11;
        return G * (mass1 * mass2) / (distance * distance);
    }
    private static double convertToKilogram(double value, String unit){
        return switch (unit) {
            case "kg" -> value;
            case "g" -> value / 1000;
            case "mg" -> value / 1000000;
            case "μg" -> value / 1000000000;
            case "lb" -> value * 0.453592;
            default -> throw new IllegalArgumentException("Invalid mass unit");
        };
    }

    private static double convertToMeter(double value, String unit){
        return switch (unit) {
            case "m" -> value;
            case "cm" -> value / 100;
            case "mm" -> value / 1000;
            case "μm" -> value / 1000000;
            case "ft" -> value * 0.3048;
            default -> throw new IllegalArgumentException("Invalid distance unit");
        };
    }
}
