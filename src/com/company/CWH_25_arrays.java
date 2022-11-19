package com.company;

public class CWH_25_arrays {
    public static void main(String[] args) {
        //classroom of 500 students - you have to store marks of these 500 students.
        /*
        1. create 500 variables
        2. use arays (recommended) - array is the collection of similar type of data.
        */

        //1. Declaration and Memory Allocation.
//        int [] marks = new int [5]; // => [dataType array name]
//        marks [0] = 100;
//        marks [1] =90;
//        marks [2] = 87;
//        marks [3] = 50;
//        marks [4] = 40;
//        marks [4] = 110; // marks[4] override ho jaega.
//        // marks [5] = 400; --> throws error -> index 5 are out of bounds for lenght 5.
//        System.out.println(marks[4]);

        //2. declaration and  then memory allocation
        int [] marks; // --> Declaration
        marks = new int [5]; // --> Memory Allocation
        marks [0] = 100;
        marks [1] =90;
        marks [2] = 87;
        marks [3] = 50;
        marks [4] = 40;
        System.out.println(marks[3]);

        //3. Declaration, memory allocation an initialization together.
//        int [] marks = {100, 70, 60, 55, 40,};
//        System.out.println(marks[4]);

    }
}
