package com.olxtest.ver;

public class solution {

    public int rectangle(int[] H) {
        int length = H.length;
        int [] maxFromLeft = new int[length];
        int [] maxFromRight = new int[length];
        int currentMax = 0;

        for (int i = 0; i < length; i++) {
            currentMax = currentMax >= H[i] ? currentMax : H[i];
            maxFromLeft[i] = currentMax;
        }
        System.out.println(maxFromLeft);

        currentMax = 0;
        for (int i = length - 1; i >= 0; i--) {
            currentMax = currentMax >= H[i] ? currentMax : H[i];
            maxFromRight[i] = currentMax;
        }
        System.out.println(maxFromRight);

        int result = Integer.MAX_VALUE;
        
        for (int i = 0; i < length; i++) {

            result = maxFromLeft[i] * i + maxFromRight[length - 1 - i] * (length - 1);
            System.out.println(result);

        }
        return result;
    }
}
