package java_8.method_reference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorRef {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice", "Bob", "Scottie", "Mark");
        List<Student> studentList = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(studentList);
    }
}
