package com.olxtest.ver;

public class App 
{
    public static void main( String[] args )
    {
        int [] P = {0, 0, 1};
        int [] Q = {0, 1, 1};
        DNASquence func = new DNASquence();
        int [] result = func.solution("GT", P, Q);
       
        for(int r: result)
        System.out.println(r + ", ");
    }
}
