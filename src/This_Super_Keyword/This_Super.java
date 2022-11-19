package This_Super_Keyword;

class Sample1 {
    int a = 30; //global
    public void test() {
        System.out.println("i am sample1");
    }
}
class Sample2 extends Sample1 {
    int a = 40;//gloval var
//    public void test() {
//        System.out.println("i am sample2");
//    }
}
class Sample3 extends Sample2 {
    int a = 500;//global
    public void test(){
        System.out.println("i am sample3");
    }
    public void display() {
        System.out.println(a);//500
        System.out.println(this.a);
        System.out.println(super.a);//bottom se search krega int a , this tab use krege jb same name ka refrence elements hoga.
        this.test();
        super.test();
    }
}

public class This_Super {
    public static void main(String[] args) {
        Sample3 obj = new Sample3();
        obj.display();


    }


}
