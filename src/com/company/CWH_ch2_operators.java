package com.company;

public class CWH_ch2_operators {
    public static void main(String[] args){
        // Arithmatic Operators
        int a = 4;
//        int b =  6 + a;
//        int b = 6 % a; // modulo operator
//        4.8%1.1--> Rwturns Decimal Remainder

          // Assignment Operators
          int b = 9;
//        b += 3; // b mein 3 jodd do
          b *= 3; // b multiply by 3
        System.out.println(b);

        // Comparison Operaters
        System.out.println(6==8);
        System.out.println(64<6);

        //Logical operators
        System.out.println(64>5 && 64>8);  //AND, dono condition TRUE hona chie
        System.out.println(65>5 || 64>98); // dono me se koi, ek condtion true hona chie

        // Bitwise Operators
        System.out.println(2&3);
        //  10
        //  11
        //-------
        //  10
    }
}
