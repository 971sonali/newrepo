package com.company;

public class Methods { //method allow us to reuse the code without retyping the code.

    public static int sum(int x,int y){
        int sum = x+y;
        return sum;
    }

    public static void main(String[] args) {
       int a = 2;
       int b = 3;

       int c = sum(a ,b);
       System.out.println(c);

       int d = 4;
       int e = 4;
       int f = sum(d , e);
       System.out.println(f);



    }

}
