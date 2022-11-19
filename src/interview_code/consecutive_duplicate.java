package interview_code;

import java.util.ArrayList;

public class consecutive_duplicate {

    public static void main(String[] args) {

        int a[] = {10,20,10,30,40,10,40,40,40,40};

        ArrayList<Integer> list = new ArrayList<>();
        list.add(a[0]);

        for(int i=1;i<a.length;i++){
            if(a[i] != a[i-1]){
                list.add(a[i]);
            }
        }

        //stored in unique values in arrayList
        for(int i:list){
            System.out.print(i+" ");
        }

    }
}
