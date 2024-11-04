package _1_ArrayAndStringManipulation.Reverse_A_String;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        System.out.print("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        System.out.println("Reversed String: "+reversed);
        sc.close();
    }
}
