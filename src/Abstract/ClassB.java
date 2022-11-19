package Abstract;

    public class ClassB  {

        public void mother() {
            System.out.println("Now i have 200 rs");
        }

        public static void main(String[] args) {
//          ClassA obj = new ClassB();
//          we can create a reference of abstract class
//          i.e. reference of abstract class = obj of subclass
            ClassB obj = new ClassB();
            obj.mother();





        }

    }

