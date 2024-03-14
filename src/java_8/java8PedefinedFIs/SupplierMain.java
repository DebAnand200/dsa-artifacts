package java_8.java8PedefinedFIs;

import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 2;
        System.out.println(supplier.get());
    }


}
