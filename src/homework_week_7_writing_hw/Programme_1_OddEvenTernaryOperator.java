package homework_week_7_writing_hw;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that us that Input number is odd or even?
 * HINT: use tenary operator(?:)
 */
public class Programme_1_OddEvenTernaryOperator {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);
        // closing the scanner object
        scanner.close();
    }
    public static void isItOddOrEvenNumber(int number){
        //ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(("The" + number + " is " + evenOrOdd + " number "));
    }
}
