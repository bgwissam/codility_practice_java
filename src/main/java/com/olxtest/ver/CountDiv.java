package com.olxtest.ver;

public class CountDiv {
    public int solution(int A, int B, int K) {
        int counter = 0;
        if(A < B) {
            if(A % K == 0) {
                counter++;
            }
             
            counter += (B - A) / K;
            
        } else if(A == B) {
            if(A % K == 0) {
                counter++;
            }
        }
        
     

        return counter;
    }
}
