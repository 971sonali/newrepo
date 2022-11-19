package Advance;

class Office1 {
    private String name;
    private int id;

    public String getname() {
        return name;
    }
    public int getid() {
        return id;
    }
//    public String setname(String myname) {
//        return name = myname;
//    }
//
//    public int setid(int myid) {
//        return id = myid;
//    }

        Office1(String myname , int myid) {
            name = myname;
            id = myid;
        }

        public void display(){
            System.out.println(this.getname());
            System.out.println(this.getid()); // In main we call var through obj name or directly , but in within the class we use this keyword to call the particular variable.
        }
}

public class practice_set {
    public static void main(String[] args) {
        Office1 obj = new Office1("sonali" , 12);
        Office1 obj1 = new Office1("babli" , 13);
        //obj.setname("sonali" );
        //obj.setid(12);
        obj1.display();
        obj.display();


    }
}
