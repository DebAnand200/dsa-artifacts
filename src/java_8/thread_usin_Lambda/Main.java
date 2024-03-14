package java_8.thread_usin_Lambda;

public class Main {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello" + i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.run();
    }
}
