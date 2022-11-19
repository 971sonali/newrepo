package Advance;

class Office {
   public String name;
   private int id;

//   public String members(String myName){
//       return this.name = myName;
//    }

    Office(int myid, String myname){
        this.id = myid;
        this.name = myname;
    }
    public void display(){
        System.out.println("name-" + this.name+ " "  + "id- " + this.id);
        //System.out.println(this.getid());
    }

}
public class Constructor_Over {
    public static void main(String[] args) {
        Office m1 = new Office(12 ,"shivani");
        Office m2 = new Office(13 ,"sonali");
        m1.display();
        m2.display();

    }
}
