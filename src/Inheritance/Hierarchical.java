package Inheritance;

class papa {
    public void money(){
        System.out.println("father has money");
    }
}

class son1 extends papa{
    public void mobile()
    {
        System.out.println("son1 has mobile");
    }
}

class son2 extends papa {
    public void laptop() {
        System.out.println("son2 has laptop");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        //we can call method of son , papa but not call son1, we need to create the obj of son1
        son2 obj = new son2();
        obj.laptop();
        obj.money();

        son1 obj1 = new son1();
        obj1.mobile();

    }

}
