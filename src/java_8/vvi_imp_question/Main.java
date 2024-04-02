package java_8.vvi_imp_question;


import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee{
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static List<Employee> getEmployeeList(){
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(121, "Payal", 28, "Female", "Infrastructure", 2021, 35000.0));
        employeeList.add(new Employee(122, "Rout", 26, "Male", "Product Development", 2020, 29000.0));
        employeeList.add(new Employee(123, "Pallavi", 28, "Female", "Account And Finance", 2020, 29000.0));
        employeeList.add(new Employee(124, "Atulya", 24, "Male", "Sales And Marketing", 2020, 30200.5));
        employeeList.add(new Employee(125, "Deb", 23, "Male", "Infrastructure", 2019, 42700.0));
        employeeList.add(new Employee(126, "Sangetha", 26, "Female", "Product Development", 2018, 38900.0));
        employeeList.add(new Employee(127, "Nayak", 25, "Male", "Product Development", 2018, 35700.0));
        employeeList.add(new Employee(111, "Liril", 23, "Female", "HR", 2017, 55000.0));
        employeeList.add(new Employee(112, "Anand", 34, "Male", "Sales And Marketing", 2019, 23500.0));
        employeeList.add(new Employee(113, "Deepak", 28, "Male", "Infrastructure", 2019, 28000.0));
        employeeList.add(new Employee(114, "Subhasis", 27, "Male", "Product Development", 2020, 62500.0));
        employeeList.add(new Employee(115, "Basu", 42, "Female", "HR", 2022, 29700.0));
        employeeList.add(new Employee(116, "Virat", 41, "Male", "Security And Transport", 2023, 20500.0));
        employeeList.add(new Employee(117, "Srinu", 36, "Male", "Account And Finance", 2019, 37000.0));
        employeeList.add(new Employee(118, "Sripati", 30, "Male", "Product Development", 2019, 34500.0));
        employeeList.add(new Employee(119, "Aishwarya", 25, "Female", "Sales And Marketing", 2021, 21500.0));
        employeeList.add(new Employee(120, "Satyajit", 37, "Male", "Security And Transport", 2021, 31000.5));
        return employeeList;
    }
}

public class Main {
    public static void main(String[] args) {
        // How many employees are there in the organization?
        List<Employee> employeeList = Employee.getEmployeeList();
        long count = employeeList.stream()
                .count();
        System.out.println(count);

        Long count2 = employeeList.stream().collect(Collectors.counting());
        System.out.println(count2);


        // Sort the List of Employee objects based on salary in Ascending order
        List<Employee> list = employeeList.stream()
                .sorted((e1, e2) -> (int)(e1.getSalary() - e2.getSalary()))
                .collect(Collectors.toList());
        list.forEach(System.out::println);
        System.out.println("********");
        // Sort the List of Employee objects based on salary in Descending order
        List<Employee> list2 = employeeList.stream()
                .sorted((e1, e2) -> (int)(e2.getSalary() - e1.getSalary()))
                .collect(Collectors.toList());
        list.forEach(System.out::println);
        System.out.println("********");

        // How many male and female employees are there in the organization?
        Map<String, Long> maleFemaleCount = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        maleFemaleCount.entrySet().forEach(System.out::println);
        System.out.println("********");
        //How many employees are there in each department?
        Map<String, Long> deptWiseCount = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        deptWiseCount.entrySet().forEach(System.out::println);
        System.out.println("********");

        //Get the name of all the department
        List<String> depts = employeeList.stream()
                .map(emp -> emp.getDepartment())
                .distinct()
                .collect(Collectors.toList());
        depts.forEach(System.out::println);
        System.out.println("********");

        //Find the average salary of the male and female employee
        Map<String, Double> avgSalByGender = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        avgSalByGender.entrySet().forEach(System.out::println);
        System.out.println("********");

        // Fetch the highest-paid male and female employee
        Map<String, Optional<Employee>> highestPaidGenderWise = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        highestPaidGenderWise.entrySet().forEach(System.out::println);
        System.out.println("********");

        //Fetch the lowest-paid male and female employee
        Map<String, Optional<Employee>> lowestPaidGenderWise = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.minBy(Comparator.comparing(Employee::getSalary))));
        lowestPaidGenderWise.entrySet().forEach(System.out::println);
        System.out.println("********");

        //Get the highest-paid employee in each department
        Map<String, Optional<Employee>> highestPaidByDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        highestPaidByDept.entrySet().forEach(System.out::println);
        System.out.println("********");

        //Get the details of the highest paid employee in the organization?
        Optional<Employee> highestPaidEmployee = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println(highestPaidEmployee.get());
        System.out.println("********");

        //Find the average salary of each department?
        Map<String, Double> avgSalOfEachDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        avgSalOfEachDept.entrySet().forEach(System.out::println);

        System.out.println("********");

        //Get the details of the youngest male employee in the product development department?
        Optional<Employee> youngestMaleEmployeeInProductDevteam = employeeList.stream()
                .filter(emp -> emp.getGender().equals("Male") && emp.getDepartment().equals("Product Development"))
//                .collect(Collectors.minBy((e1, e2) -> (e1.getAge() - e2.getAge())));
        .min(Comparator.comparing(Employee::getAge));
        System.out.println(youngestMaleEmployeeInProductDevteam.get());
        System.out.println("********");

        //Who has the most working experience in the organization?
        Optional<Employee> mostWorkingExperience = employeeList.stream()
                .min(Comparator.comparing(Employee::getYearOfJoining));
        System.out.println(mostWorkingExperience.get());

        Optional<Employee> mostWorkingExperience2 = employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getYearOfJoining))
                .findFirst();
        System.out.println(mostWorkingExperience2.get());
        System.out.println("********");

//        Who is the oldest employee in the organization?
        Optional<Employee> oldestEmployee = employeeList.stream()
                .max(Comparator.comparing(Employee::getAge));
        System.out.println(oldestEmployee);
        System.out.println("********");

        //What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics avgTotalMaxMinSummaryOfSalary = employeeList.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Max: "+avgTotalMaxMinSummaryOfSalary.getMax());
        System.out.println("Min: "+avgTotalMaxMinSummaryOfSalary.getMin());
        System.out.println("Avg: "+avgTotalMaxMinSummaryOfSalary.getAverage());
        System.out.println("Total: "+avgTotalMaxMinSummaryOfSalary.getSum());

        //List down the names of all employees in each department?
        Map<String, List<Employee>> empByDeptMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        for (Map.Entry<String, List<Employee>> entry : empByDeptMap.entrySet()) {

            System.out.println("*************************");
            System.out.println("Employees in "+ entry.getKey() +" Department");

            for (Employee emp : entry.getValue()) {
                System.out.println(emp.getName());
            }
            System.out.println("*************************");
        }

        System.out.println("*************************");
        //Separate the employees who are younger or equal to 30 years from those older than 30 years.
        Map<Boolean, List<Employee>> empMapYoungerOrElder30 = employeeList.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() > 30));
        empMapYoungerOrElder30.entrySet().forEach(System.out::println);
        for(Map.Entry<Boolean, List<Employee>> entry : empMapYoungerOrElder30.entrySet()) {
            System.out.println("*************************************");
                if (entry.getKey()){
                    System.out.println("Employee less than 30 years");
                }else{
                    System.out.println("Employee older than 30 years");
                }
            for (Employee emp : entry.getValue()) {
                System.out.println(emp.getName());
            }
            System.out.println("*************************************8");
        }
    }
}
