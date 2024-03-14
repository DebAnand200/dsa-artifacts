package java_8.LambdaVSInnerClass;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee() {
            @Override
            public String getSalary() {
                return "7000000";
            }

            @Override
            public String getDesignation() {
                return "SDE-II";
            }
        };
        System.out.println("My designation is "+emp.getDesignation()+ " & my salary is "+ emp.getSalary());
    }
}
