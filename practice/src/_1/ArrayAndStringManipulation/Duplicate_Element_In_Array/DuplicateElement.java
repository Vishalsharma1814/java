package _1.ArrayAndStringManipulation.Duplicate_Element_In_Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Set<Integer> duplicates = findDuplicates(arr);
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found!");
        } else {
            System.out.println("Duplicates elements are: " + duplicates);
        }

    }

    static Set<Integer> findDuplicates(int[] input) {
        Set<Integer> duplicate = new HashSet<>();
        Set<Integer> elements = new HashSet<>();
        for (int e : input) {
            if (!elements.add(e)) {
                duplicate.add(e);
            }
        }
        return duplicate;
    }
}
