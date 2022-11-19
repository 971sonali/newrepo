package com.company;
import java.util.Scanner;

public class CWH_18_elseif {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
         String str = sc.next();
        switch (str) {
            case "rishu":
                System.out.println("You are going to become an adult!");
                break;
            case "vishu":
                System.out.println("You are going to join a job!");
                break;
            case "trishu":
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy Your Life!");
                break;
        }
        System.out.println("Thanks for using my java code");

       /*
        // if-else-if-else ladder.
        System.out.println("enter your age");
        int age = sc.nextInt();
        if (age>56){
            System.out.println("You are Experienced");
        }
        else if(age>46){
            System.out.println("You are Semi Experienced");
        }
        else if(age>36){
            System.out.println("You are semi-semi Experienced");
        }
        else{
            System.out.println("You are not Experienced");
        }

         */
    }
}
