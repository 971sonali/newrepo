package Advance;
class Person {
    String name;
    int age;

    static int count; //to know how many persons are you created.

//        public void printDetails(){
//        System.out.println(this.name);
//        System.out.println(this.age);
//    }
    void walk() {
        System.out.println(name + " "+ "is walking");
    }
    void walk(int steps) {
        System.out.println(name +" walked "+ steps);
    }
    void eat() {
        System.out.println(name +" " + "is eating");
    }
    Person() {
        count++;
        System.out.println("creating an object");
    }
    Person(int newAge , String newName){
        this(); //this call the class constructor.
        age = newAge;
        name = newName;
        System.out.println(this.name);
    }
}
public class Constructors {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "sonali";
        p1.age = 26;
        System.out.println(p1.name +" "+ p1.age);

        Person p2 = new Person(32 , "vijay");
        p2.name = "atul";
        p2.age = 50;
        System.out.println(p2.name +" "+ p2.age);

        p1.walk();
        p1.walk(2);
        p2.eat();
        System.out.println(Person.count);
//      p1.printDetails();
//      p2.printDetails();

    }
}
