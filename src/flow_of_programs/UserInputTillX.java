package flow_of_programs;

import java.util.Scanner;

public class UserInputTillX {
    //Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String input;
        do {
            System.out.println("Enter Number: ");
            input = sc.nextLine();
            if(!input.equalsIgnoreCase("x")){
                try{
                    int number = Integer.parseInt(input);
                    sum += number;
                }catch(NumberFormatException e){
                    System.out.println("Invalid input. Please enter a number.");
                }
            }
        }while (!input.equalsIgnoreCase("x"));
        System.out.println("The sum of all numbers is :"+sum);
    }
}