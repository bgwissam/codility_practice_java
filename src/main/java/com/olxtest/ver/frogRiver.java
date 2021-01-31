package com.olxtest.ver;

import java.util.ArrayList;

public class frogRiver {
    public int solution (int X, int[] A) {
        ArrayList<Integer> path = new ArrayList<>();
        for(int i = 0; i < X; i++) {
            path.add(i + 1);
        }
        for(int i = 0; i < A.length; i++) {
            
            if(path.contains(A[i])) {
                path.remove(Integer.valueOf(A[i]));
            }

            if(path.size() == 0) {
                return i;
            }
        }
        return -1;
    }
}
