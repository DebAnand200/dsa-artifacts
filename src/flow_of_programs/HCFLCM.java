package flow_of_programs;
import java.util.Scanner;
public class HCFLCM {
    //Take 2 numbers as inputs and find their HCF and LCM.
    /**
     * EX:-HCF(10,20)
     * Find The Factors Of Each Number
     * 10:1,2,5,10
     * 20:1,2,4,5,10,20
     * Identify The common factor
     * Common Factors Are: 1,2,5,10
     * Choose the Highest Common factor
     * 10 is greatest in 1,2,5,10
     * Answer: HCF(10,20) = 10
     * Above is the naive proces and down we have applied Euclidean Method which more efficient and Optimized
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        //Calculation of HCF using Euclidean Algorithm
        int hcf = calculateHCF(num1, num2);
        //Calculation of LCM using formula LCM = (num1 * num2) / HCF
        int lcm = (num1 * num2) / hcf;
        System.out.println("HCF Of "+ num1 + " and "+ num2 +" is: "+hcf);
        System.out.println("LCM Of "+ num1 + " and "+ num2 +" is: "+lcm);
    }

    private static int calculateHCF(int num1, int num2) {
        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
