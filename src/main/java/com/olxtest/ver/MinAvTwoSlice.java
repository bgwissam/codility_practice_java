package com.olxtest.ver;

public class MinAvTwoSlice {
    public int solution(int[] A) {
        double a = A[0];
        double b = A[1];
        double c;
        double minAvgValue = ((a + b) / 2.0);
        int minAvgPos = 0;
        
        for (int i = 0; i < A.length - 2; i++) {
            a = A[i];
            b = A[i+1];
            c = A[i+2];
            if((a + b)/2.0 < minAvgValue){
                minAvgValue = (A[i] + A[i+1])/2.0;
                System.out.println("Slice 2: " + minAvgValue);
                minAvgPos = i;
            }
            if((a + b + c) / 3.0 < minAvgValue) {

                minAvgValue = (A[i] + A[i + 1] + A[i + 2])/3.0;
                System.out.println("Slice 3: " + minAvgValue);
                minAvgPos = i;
            }
        }
        if((A[A.length - 2] + A[A.length - 1])/2.0 < minAvgValue) {
            minAvgValue =(A[A.length - 2] + A[A.length - 1])/2.0;
            minAvgPos = A.length - 2;
        }
        
        return minAvgPos;
    }
}
