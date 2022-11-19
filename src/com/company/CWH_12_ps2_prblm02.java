package com.company;

public class CWH_12_ps2_prblm02 {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char)(grade + 8); // Char+int = int, Typecasting.
        System.out.println(grade);

        //Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
