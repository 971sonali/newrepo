package practice_set;
import  java.util.Scanner;

public class p1 {
    public static void main(String[] args) {

//        int a [] = {10,20,30,40,50,60};
//    //              90,10,20,30,40,50
//        //System.out.println(a.length);//6
//        int store = a[a.length-1]; //a[5]
//
//        for(int i=a.length-1;i>0;i--){
//            a[i] = a[i-1]; //a[5] = a[4]
//
//        }
//
//        System.out.println("--reading values--");
//        a[0] = store;
//        for(int k=0;k<=a.length-1;k++){
//            System.out.print(a[k]+" ");
//        }



        int a [] = {10,20,30,40,50,60}; //5

        int store = a[0];

        for(int i=0;i<a.length-1;i++){
            a[i] = a[i+1];
        }

        a[5] = store;
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+" ");
        }



//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int [n];
//
//        for(int i=0;i<n;i++){
//            a[i] = sc.nextInt();
//        }
//        int arr[] = new int[a.length]; //5
//
//        for(int j=0;j<a.length;j++) {
//           arr[j] =a[j];
//            System.out.print(arr[j]+" ");
//        }














    }
}
