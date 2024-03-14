package java_8.thread_usin_Lambda;

public class MyClass implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello" + i);
        }
    }
}
