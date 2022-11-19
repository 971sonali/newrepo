package Inheritance;

class shape { //super
    public void display (){
        System.out.println("shape display");
    }
}

class radius extends shape { //subclass
    public void area(){
        System.out.println("triangle has area");
    }
}

class circle extends radius{ //subclass
    public void area(){
        System.out.println("circle has area");
    }
}

//class circumf extends {
//    public void area(){
//        System.out.println("circumf has area");
//    }
//}

public class Multi_Level {
}
