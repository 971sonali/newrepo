package Inheritance;
class father{
    public void money(){
        System.out.println("i have 100");
    }
}
class son extends father {
    public void mobile(){
        System.out.println("i have mobile");
    }
}

public class Single_Level  {
    public static void main(String[] args) {
        son obj = new son();
        obj.mobile();
        obj.money();


    }
}
