package com.company;

public class CWH_23_break_continue {
    public static void main(String[] args) {
        //break and continue using loops
        //break statement is used to exit loop irrespective of whether the condition is true or false.
//        for(int i=0; i<5; i++){
//            System.out.println(i);
//            System.out.println("Java is Great");
//            if (i == 2) {
//                System.out.println("Ending the Loop");
//                break;
//            }
//        }

        //using while loop
//        int i = 0;
//        while(i<5){
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==2){  // i agar 2 nhi h to, ignore this statement
//                System.out.println("ending the loop");
//                break;
//            }
//            i++;
//        }
//        System.out.println("Loops Ends Here");

        //Using Do-While Loop
//        int i = 0;
//        do{
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==2){
//                System.out.println("ends loop");
//                break;
//            }
//            i++;
//        }while(i<5);

        //Continue using for-loop
//        for(int i=0; i<5; i++){
//            if(i==2){
//                System.out.println("loop ends here");
//                continue; // used to immediately move to the next iteration of loop. continue mtlb neeche ka portion skip kr do.
//            }
//            System.out.println(i);
//            System.out.println("java is great");
//        }

        // do-while loop
//        int i = 0;
//        do{
//            i++;
//            if(i==2){
//                System.out.println("Loop ends here");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Java is great");
//
//        }while(i<5);

        //while loop
        int i = 0;
        while(i<5){
            i++;
            if(i==2){
                System.out.println("loop ends here");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");

        }
    }
}
