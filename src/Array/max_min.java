package Array;
import java.util.Arrays;

public class max_min {
    public static void main(String[] args) {

        int [] a = {20,50,70,80,10};
        Arrays.sort(a);
        int len = a.length;
        for(int i=0;i<=len-1;i++){
            System.out.print(a[i] + " ");
        }
        //10,20,50,70,80
        //0, 1, 2, 3, 4,=total-[5], 5-2->3
        int k = a.length-2;
        //System.out.println(a.length-2);//index
        System.out.println("2nd largest " +a[k]);

//        int max = a[0];//20
//        for(int j=1;j<=len-1;j++){//50,70,80,10
//            if(a[j]>max){ //50>20, 70>50, 80>70, 10>80
//                max = a[j];//50,70,80,80
//            }
//        }
//        System.out.println(max);

    }


}
