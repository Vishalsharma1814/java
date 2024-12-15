package _4_SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements of array!");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array after sorting: ");
        for (int i : bubbleSort(arr)) {
            System.out.print(i+" ");
        }
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        return arr;
    }
}
