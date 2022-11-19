package interview_code;

public class CountTheWords {

    //given string count many words are there
    public static void main(String[] args) {

        String s = " Welcome To Java";

       //there should be 1-space after char, after space there should not be any space.
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' ' && s.charAt(i+1) != ' '){
                count++;
            }
        }
        System.out.println("no of words in a string:" +count);




    }
}
