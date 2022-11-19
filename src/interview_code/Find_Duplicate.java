package interview_code;


import java.util.HashSet;
import java.util.Set;

public class Find_Duplicate {

    public static void main(String[] args) {

        String names [] = {"sonali", "sonali" , "mukesh" , "sonali"};

        Set<String> stores= new HashSet<String>();

        for(String i :names){
        if(stores.add(i) == false){
            System.out.println("duplicates:" + i);
        }
        }

    }

}
