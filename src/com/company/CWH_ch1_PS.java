package com.company;
import java.util.Scanner;

public class CWH_ch1_PS {
    public static void main(String[] args) {


//     question 1
//        int a = 4;
//        int b = 7;
//        int c = 6;
//        int sum = a + b + c;
//        System.out.println(sum);

//     question2---> calculate cgpa
//        int subject1 = 45;
//        int subject2 = 95;
//        int subject3 = 48;
//        float cgpa = (subject1 + subject2 + subject3)/30f;
//        System.out.println(cgpa);

//     question3
//       System.out.println("What is your name");
//       Scanner sc = new Scanner(System.in);
//       String name = sc.next();
//       System.out.println("hello " +name+  " have a good day! ");

//     question4--> kilometers to miles
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter kms: ");
//         float a = sc.nextFloat();
//         System.out.println(a * 0.621); // 1 kms = 0.621 mile

//     question5---> detect whether no. entered is Integer or not
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

    }
}