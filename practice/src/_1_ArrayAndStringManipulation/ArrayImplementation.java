package _1_ArrayAndStringManipulation;

import java.util.Arrays;
/**
 * An array is a collection of elements stored at contiguous memory locations.
 * It provides O(1) access to elements using an index.
 */

public class ArrayImplementation {
    public static int[] createArray(int... args) {
        int[] ints = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            ints[i] = args[i];
        }
        return ints;
    }

    public static void main(String[] args) {
        int[] result = createArray(1, 3, 4, 5, 7, 8);
        System.out.println(Arrays.toString(result));
        for (int a : result) {
            System.out.print(a + " ");
        }
    }
}
