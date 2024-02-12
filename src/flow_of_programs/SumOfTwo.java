package flow_of_programs;

public class SumOfTwo {
    //Take two numbers and print the sum of both.
    public static void main(String[] args) {
        int x = 10;
        int y = 200;
        System.out.println("Sum: "+sum(x,y));
    }
    private static int sum(int x, int y) {
        return x+y;
    }
}
