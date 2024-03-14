package java_8;


interface Parent{
    default void sayHello(){
        System.out.println("Hellow");
    }
}

class Child implements Parent{
    @Override
    public void sayHello() {
        System.out.println("Child Says Hello");
    }
}



interface A{
    static void sayHello(){
        System.out.println("A Hellow");
    }
}



public class Main implements A{
    public static void main(String[] args) {
        A.sayHello();
    }
    static void sayHello(){
        System.out.println("A Hellow");
    }
}
