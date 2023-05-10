package com.example.codewars.KYU_8.Algebra;

public class PythagoreanTriple_8_KYU {
    public static void main(String[] args) {
        PythagoreanTriple_8_KYU pythagoreanTriple8Kyu = new PythagoreanTriple_8_KYU();
        System.out.println(pythagoreanTriple8Kyu.pythagoreanTriple(new int[]{13, 12, 5}));
    }

    public int pythagoreanTriple(int[] triple){
        int arr_size = triple.length;
        for (int i = 0; i < arr_size; i++) {
            for (int j = i + 1; j < arr_size; j++) {
                for (int k = j + 1; k < arr_size; k++) {
                    // Calculate square of array elements
                    int x = triple[i] * triple[i],
                        y = triple[j] * triple[j],
                        z = triple[k] * triple[k];

                    if (x == y + z || y == x + z || z == x + y)
                        return 1;
                }
            }
        }

        return 0;
    }

}
