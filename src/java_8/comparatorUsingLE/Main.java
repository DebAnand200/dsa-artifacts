package java_8.comparatorUsingLE;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(12, "Bill");
        Student s2 = new Student(42, "Elon");
        Student s3 = new Student(32, "Mark");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Collections.sort(list, (a, b) -> b.id - a.id);

        System.out.println(list);

    }
}
