package com.olxtest.ver;

import java.util.Arrays;

public class permutationArray {
    public int solution(int[] A) {
        
        Arrays.sort(A);
        if ((A.length) > 1) {
            if(A[0] == 1)
            for (int index = 0; index < A.length - 1; index++) {
                if (A[index + 1] - A[index] != 1)
                    return 0;
            }
            else return 0;
        }

        else {
            if (A[0] == 1) {
                return 1;
            } else {
                return 0;
            }
        }
        return 1;
    }
}
