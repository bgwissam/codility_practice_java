package com.olxtest.ver;
import java.util.Arrays;

public class counterIncrease {
    public int[] solution(int N, int[] A) {
        
        
        int[] result = new int[N];
        int max = 0;

        for(int i = 0; i < A.length; i++) {
            if(A[i] > N) {
               for(int j: result) {
                    max = max > j ? max : j;
               }

               Arrays.fill(result, max);
            }
            else if(A[i] <= N) {
               result[A[i] - 1] = result[A[i] - 1] + 1;
            }
        }
    

        return result;
    }
}
