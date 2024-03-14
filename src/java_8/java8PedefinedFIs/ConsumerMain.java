package java_8.java8PedefinedFIs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerMain {
    //Predicate - Boolean valued function
    //Function - Operation

    //Consumer
    //Supplier

    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Debanand");

        Consumer<List<Integer>> conFun = s -> {
            for (Integer n: s) {
                System.out.println(n+ 100);
            }
        };

        Consumer<List<Integer>> conFun2 = s -> {
            for (Integer n: s) {
                System.out.println(n);
            }
        };

        Consumer<List<Integer>> listConsumer = conFun2.andThen(conFun);
        listConsumer.accept(Arrays.asList(1,2,3,4,5,6,7,8,9));

    }
}
