package com.olxtest.ver;

import java.util.Arrays;

public class positiveInteger {
    public int solution(int[] A) {

        Arrays.sort(A);
        int smallesPositive = 1;
        for(int index = 0; index < A.length; index++) {
            if(smallesPositive == A[index]) {
                smallesPositive++;
            }
            
        }

        return smallesPositive;
    }
}
