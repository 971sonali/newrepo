package com.company;

public class CWH_21_chap5_do_while {
    public static void main(String[] args) {
        System.out.println("While Loop");
        int a =0;
        while(a<5){   // checks the condition & executes the code.
            System.out.println(a);
            a++;
        }
        System.out.println("Do-while loop");
        int i = 0;
        do{       // executes the code & then checks the condition.
            System.out.println(i);
            i++;
        }while(i<5);

        //question1 print 1st n natural number. using do-while loop
        int b = 1;
        do{
            System.out.println(b);
            b++;
        }while(b<=45);
    }
}
