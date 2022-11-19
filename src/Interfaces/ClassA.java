package Interfaces;

abstract class ClassC {
    public void mukesh(){
        System.out.println("hi i am mukesh!");
    }
    abstract public void demo();
}
 interface parent {
    void  money(); // by default public method
    void land();
}
interface mother {
     void food();
     void care();
}
class sample extends ClassC implements parent  {
     public void display(){
         System.out.println("Namaste");
     }
     public void money(){
         System.out.println("100 rs");
     }
     public void land(){
        System.out.println("1 acres");
    }
    public void food(){
        System.out.println("Tasty food");
    }
    public void care(){
        System.out.println("take care of us");
    }
    public void demo(){
        System.out.println("i am demo ");
    }

}

public class ClassA {
    public static void main(String[] args) {
        sample obj = new sample();
        obj.display();
        obj.care();
        obj.food();
        obj.land();
        obj.money();


    }
}
