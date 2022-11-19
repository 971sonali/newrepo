package This_Super_Keyword;


public class Example2 extends Example1 {

    int a1 = 200;//global
    public void test () {
        System.out.println("i am current class");
    }

    public void printinfo(){
        System.out.println(this.a1);//current
        System.out.println(super.a);//parent
        this.test();
        super.test();



    }

}


