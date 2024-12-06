package _14_InterviewQuestions.ControlStructureAndLoops;

import java.util.Scanner;

public class LCM {
    // Function to calculate GCD using the Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using the formula: LCM = (a * b) / GCD(a, b)
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(gcd(10,5));
        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate LCM
        int lcm = lcm(num1, num2);

        // Output the result
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);


    }
}
