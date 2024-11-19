package _4_SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;
//How it works: Works on a sorted array. Repeatedly divides the search interval in half. Check the middle element; if it matches, return it. If it's greater or smaller, search in the corresponding half.

//Time Complexity:𝑂(log⁡ 𝑛)O(logn) — Each step cuts the array size in half.

//Space Complexity:𝑂(1)O(1) — No extra space in iterative version;𝑂(log⁡ 𝑛)O(logn) for recursive version due to call stack.
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target ) {
                left = mid + 1;
            } else {
                right = mid - 1;
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
        System.out.println("Found at index: "+binarySearch(arr, sc.nextInt()));
    }
}
