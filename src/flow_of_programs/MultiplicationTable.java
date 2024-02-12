package flow_of_programs;

public class MultiplicationTable {
    //Take a number as input and print the multiplication table for it.
    public static void main(String[] args) {
        int x = 9;
        printTable(x);
    }

    private static void printTable(int x) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(x+" X "+i+" = "+(x*i));
        }
    }
}
