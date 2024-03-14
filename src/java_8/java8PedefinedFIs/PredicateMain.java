package java_8.java8PedefinedFIs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 10000;
        System.out.println(predicate.test(20000));

        List<Integer> salary = Arrays.asList(1,3,2,4,3,5,6,7,8,9);
        int sum = salary.stream().filter(x -> x % 2 == 0).mapToInt(n -> n).sum();
        System.out.println(sum);

        int sum2 = 0;
        for (int n: salary) {
            if (n%2 == 0){
                sum2 += n;
            }
        }


        Predicate<Integer> isEven = x -> x%2 == 0;
        int sum3 = 0;
        for (int n: salary) {
            if (isEven.test(n)){
                sum3 += n;
            }
        }

        Predicate<String> startsWithLetterD = x -> x.toLowerCase().startsWith("d");
        Predicate<String> endsWithLetterD = x -> x.toLowerCase().endsWith("d");
        Predicate<String> or = startsWithLetterD.or(endsWithLetterD);
        System.out.println(or.test("Vivek"));
        System.out.println(startsWithLetterD.negate().test("DebAnand"));


        Student s1 = new Student(12, "Deb");
        Student s2 = new Student(22, "Anand");

        //Students Whose name starts with A
        Predicate<Student> studentNameStartsWithA =  s -> s.getName().startsWith("A");
        System.out.println(studentNameStartsWithA.test(s1));

        Predicate<String> isEqual = Predicate.isEqual("DebAnand");
        System.out.println(isEqual.test("DebAnand"));
    }
}
class Student{
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}