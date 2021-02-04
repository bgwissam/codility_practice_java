package com.olxtest.ver;

public class PassingCars {
    public static int solution(int[] A) {

        int carZero = 0;
        int carOne = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
               carZero++;
            } else {
                carOne = carOne + carZero;
            }
            if (carOne > 1000000000) {
                return -1;
            }
        }

        return carOne;
    }

}
