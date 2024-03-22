package java_8.method_reference;

import java.util.Arrays;
import java.util.List;

public class MethodRef {

    public void print(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        MethodRef methodRef = new MethodRef();
        List<String> list = Arrays.asList("Alice", "Bob", "Scottie", "Mark");
        list.forEach(methodRef::print);
    }
}
