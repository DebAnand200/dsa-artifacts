package java_8.LambdaImple;

public class Main {
    public static void main(String[] args) {
        Employee employee = () -> "SDE-II";
        System.out.println(employee.getRole());
    }
}
