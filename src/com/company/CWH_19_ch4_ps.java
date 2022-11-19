package com.company;
import java.util.Scanner;

public class CWH_19_ch4_ps {
    public static void main(String[] args) {
        //problem1
//        int a = 10;
//        if(a == 11){
//            System.out.println("I am 11 ");
//        }
//        else{
//            System.out.println("I am not 11");
//        }

        //problem2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("subject 1");
//        int a = sc.nextInt();
//        System.out.println("subject 2");
//        int b = sc.nextInt();
//        System.out.println("subject 3");
//        int c = sc.nextInt();
//        float avg = (a+b+c)/3.0f;
//        System.out.println(avg);
//        if( avg>=40 && a>=33 && b>=33 && c>=33 ){
//            System.out.println("Congrats You have been promoted");
//        }
//        else{
//            System.out.println("Sorry, You have not been promoted! Please try again.");
//        }

        //problem3
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        // i am using Enhanced Switchcase for comfort , avoiding break statement.
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("no day");
//        }

        //problem4 find out wheather the year is leap year or not.
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//        if(year% 400 == 0){
//            System.out.println("true");
//        }
//        else if(year% 4==0){
//            System.out.println("true");
//        }
//        else if(year% 100==0){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }

        //problem5
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".com")){
            System.out.println("its a commercial website");
        }
        else if (website.endsWith(".org")) {
            System.out.println("its a organisation website");
        }
        else if(website.endsWith(".in")){
            System.out.println("its indian website");
        }



    }
}
