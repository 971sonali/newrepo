package Array;

public class Left_Rotate {
    public static void main(String[] args) {

        //3.LEFT ROTATE

        int a[] = {30, 60, 70, 40, 65, 90, 78, 100}; //total-8
           //      0   1   2   3   4   5   6    8

        //READ ELEMENTS
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] +"  ");
        }

        System.out.println();

        for(int j=5;j<a.length;j++){
            System.out.print(a[j] +" ");
        }

        for(int i=0;i<a.length-1;i++){ //7-1=6
            int store = a[i];
            System.out.print(store +" ");
        }


//    //2.2nd Smallest
//    int a[] = {30, 60, 70, 40, 65, 90, 78};
//    Arrays.sort(a);
//    for(int i=a.length-1;i>=0;i--){
//        System.out.print(a[i] + " ");
//    }
//        System.out.println("");
//    //90,78,70,65,60,40,30
//    //0, 1,  2, 3,4, 5 ,6 = total 7-2 =5
//    int j = a.length-2;
//    //System.out.println(a.length-2);//index a[5]
//        System.out.println("Index:" +a[j]);

//    //1.COPY ELEMENTS
//        int a[] = {30, 60, 70, 40, 65, 90, 78};
//        int a1[] = new int[a.length];
//        for(int i=0;i<=a.length-1;i++){ //for fetch index no.
//            a1[i] = a[i];
//            System.out.print(a1[i] + " ");
//        }







    }
}




//    String s[] = {"sonali", "mukesh", "atul", "sandy","shobit"};
//    String s1[] = new String[s.length];// used to store total size



