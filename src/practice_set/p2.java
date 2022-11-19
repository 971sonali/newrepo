package practice_set;

class Bank {
    String name;
    int id;

    public Bank(String myname, int myid) {
        id = myid;
        name = myname;
    }
    public void display() {
        System.out.println("name: " + name + " id: " + id);
    }
}

public class p2 {
    public static void main(String args[])  {
        Bank obj = new Bank("Sonali", 11);
        Bank obj1 = new Bank("Mukesh" , 12);
        obj.display();
        obj1.display();

  }
}





