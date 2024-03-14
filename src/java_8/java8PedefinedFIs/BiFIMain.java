package java_8.java8PedefinedFIs;

import java.util.function.*;

public class BiFIMain {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x % 2==0;
        BiPredicate<Integer, Integer> biPredicate = (x,y) -> (x+y) % 2 == 0;
        Function<String, Integer> function = x -> x.length();
        BiFunction<String, String, String> biFunction = (x,y) -> x+y;
        Consumer<Integer> consumer = x -> System.out.println(x);
        BiConsumer<String, String> biConsumer = (x,y) -> System.out.println(x+y);
        Supplier<Integer> supplier = () -> 100;
        Supplier<Integer> supplier2 = () -> 200;

        if(biPredicate.test(supplier.get(), supplier2.get())){
            biConsumer.accept(biFunction.apply("Deb", "Anand "), biFunction.apply("Be", "hera"));
        }
    }
}
