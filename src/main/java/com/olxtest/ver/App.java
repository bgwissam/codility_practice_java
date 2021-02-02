package com.olxtest.ver;

public class App 
{
    public static void main( String[] args )
    {
        int [] P = {4, 2, 2, 5, 1, 5, 8};
        MinAvTwoSlice func = new MinAvTwoSlice();
        int result = func.solution(P);
       
        
        System.out.println(result);
    }
}
