package _1.ArrayAndStringManipulation.Rotate_Array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

    }
}
