package Inheritance;

class surendra{
    public void land (){
        System.out.println("surendra have land");
    }
}

class sonali extends surendra{
    public void mobile () {
        System.out.println("sonali have mobile");
    }
}

class aman extends sonali {
    public void laptop() {
        System.out.println("aman have laptop");
    }
}

public class Multiple_level extends aman{
    public static void main(String[] args) {
        Multiple_level obj = new Multiple_level();
        obj.laptop();
        obj.mobile();
        obj.land();


    }


}
