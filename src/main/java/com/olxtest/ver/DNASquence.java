package com.olxtest.ver;

public class DNASquence {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[] result = new int[P.length];
        char[] subS = S.toCharArray();
        String semiString = "";
        
        for (int i = 0; i < P.length; i++) {
            StringBuilder r = new StringBuilder();
            for (int j = P[i]; j <= Q[i]; j++) {

                r.append(subS[j]);

            }
            semiString = r.toString();
            System.out.println(semiString);
            if (semiString.contains("A")) {
                result[i] = 1;
                continue;
            } else if (semiString.contains("C")) {
                result[i] = 2;
                continue;
            } else if (semiString.contains("G")) {
                result[i] = 3;
                continue;
            } else {
                result[i] = 4;
                continue;
            }
        }

        return result;
    }
}
