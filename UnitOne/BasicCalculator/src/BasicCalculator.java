import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to my amazing calculator!");
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Please enter the second number: ");
        double num2 = input.nextDouble();

        int num1Int = (int)Math.round(num1);
        int num2Int = (int)Math.round(num2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        // change to int
        int remainder = num1Int % num2Int;
        double root = Math.sqrt(num1);

        System.out.println();
        System.out.println("The sum of " + num1 + " and " + num2 + " is " +sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println("The product of " + num1 + " and " + num2 + " is " + product);
        if (num1 == 0 || num2 == 0) {
            System.out.println("Cannot divide by zero!");
        } else {
            System.out.println(num1 + " / " + num2 + " = " + quotient);
        }
        if (remainder == 0) {
            System.out.println("There is no remainder!");
        } else {
            System.out.println("Numbers are rounded for remainder");
            System.out.println(num1Int + " % " + num2Int + " = " + remainder);
        }
        System.out.println("The square root of " + num1 + " is " + root);
    }
}
