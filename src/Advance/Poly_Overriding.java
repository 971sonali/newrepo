package Advance;

 class Animal {
     public void eat() {
         System.out.println("animal is eating");
     }

     public static void demo() {
         System.out.println("i am property of parent");
     }
 }
     class Cat extends Animal {
         public void eat() { //method overriding
             System.out.println("cat is eating");
         }
         public static void demo(){ //method hiding
             System.out.println("trying to override");
         }
     }
     class Dog extends Cat {
         public void eat()
         {
             System.out.println("dog is eating");
         }

     }
     public class Poly_Overriding {

        public static void main(String[] args) {
            Dog obj = new Dog();
            obj.eat();

            Dog.demo();
            //Cat obj1 = new Dog();


        }

    }

