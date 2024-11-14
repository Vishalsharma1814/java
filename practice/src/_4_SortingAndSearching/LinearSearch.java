package _4_SortingAndSearching;

import java.util.Scanner;
//How it works: Check each element one by one until you find the target or reach the end of the array.

//Time Complexity:𝑂(𝑛)O(n) — Worst case, you need to check all elements.

//Space Complexity:𝑂(1)O(1) — No extra space is used.
public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.print("Please specify the size of array: ");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter "+(i+1)+" element:");
            arr[i] = sc.nextInt();
        }
        System.out.print("Please specify the element you're looking for: ");
        System.out.println("Found at index: "+linearSearch(arr, sc.nextInt()));
    }
}
