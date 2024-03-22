package java_8;

@FunctionalInterface
public interface MyInterface {
    public void sayHello();
    default void sayHello2(){
        System.out.println("Hello2");
    }
    static void sayHello3(){
        System.out.println("Hello3");
    }
}
