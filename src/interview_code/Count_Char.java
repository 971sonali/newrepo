package interview_code;

public class Count_Char {

    //specify which character u want to count.
    public static void main(String[] args) {

        String s = "acvvvedffffff ";

        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'f'){
                count++;
            }
        }
        System.out.println(count);
    }
}
