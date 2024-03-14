package java_8.java8PedefinedFIs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
        Function<String, Integer> f =  x -> x.length();
        System.out.println(f.apply("DebAnand"));

        Function<String, String> f1 = x -> x.substring(0,3);
        System.out.println(f1.apply("Debanand"));

        Function<List<Student>, List<Student>> startsWithDebAsPrefix = list -> {
            List<Student> result = new ArrayList<>();
            for (Student s: list) {
                if(f1.apply(s.getName()).equalsIgnoreCase("deb")){
                    result.add(s);
                }
            }
            return result;
        };


        Student s1 = new Student(12, "Deba");
        Student s2 = new Student(22, "Debi");
        Student s3 = new Student(12, "Debasish");
        Student s4 = new Student(22, "DebAnand");
        Student s5 = new Student(12, "Hello");
        Student s6 = new Student(22, "Anand");
        List<Student> list = Arrays.asList(s1, s2, s3, s4, s5, s6);
        List<Student> filteredStudents = startsWithDebAsPrefix.apply(list);
        System.out.println(filteredStudents);

        Function<String, String> function = x -> x.toLowerCase();
        Function<String, String> function2 = x -> x.substring(0,3);
        System.out.println(function.andThen(function2).apply("DEBAnanda behera"));
        System.out.println(function2.andThen(function).apply("DEBAnanda behera"));

        Function<Integer, Integer> fun3 = x -> 2 * x;
        Function<Integer, Integer> fun4 = x -> x * x * x;
        System.out.println(fun3.andThen(fun4).apply(5)); // 1000
        System.out.println(fun4.andThen(fun3).apply(5)); //250
        System.out.println(fun3.compose(fun4).apply(5)); //250


        Function<String, String> identityFunction = Function.identity();
        System.out.println(identityFunction.apply("DebAnand Behera"));


    }
}
