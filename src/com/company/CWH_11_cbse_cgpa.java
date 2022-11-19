package com.company;
import java.util.Scanner;
public class CWH_11_cbse_cgpa {
    public static void main(String[] args){
        System.out.println("Enter Marks:");
        Scanner sc = new Scanner(System.in);
        System.out.println("subject 1");
        int a = sc.nextInt();
        System.out.println("subject 2");
        int b = sc.nextInt();
        System.out.println("subject 3");
        int c = sc.nextInt();
        System.out.println("subject 4");
        int d = sc.nextInt();
        System.out.println("the percentage is:");
        int percentage = (a+b+c+d)/4;
        System.out.println(percentage);
        System.out.println("the cgpa is:");
        double cgpa = (percentage/9.5);
       //float cgpa =(float)(percentage/9.5f);
        System.out.println(cgpa);

    }
}
