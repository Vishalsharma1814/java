package _14_InterviewQuestions.Arrays;

import java.util.Arrays;

public class ShiftArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original Array: " + Arrays.toString(arr));
        int count = 3;
        int[] temp = new int[count];
        System.arraycopy(arr, 0, temp, 0, count);
        System.out.println(Arrays.toString(temp));
        System.arraycopy(arr, count, arr, 0, arr.length - count);
        System.arraycopy(temp, 0, arr, arr.length - count, count);
        System.out.println("Left Shifted by " + count + " Positions: " + Arrays.toString(arr));

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int count2 = 4;
        int[] temp2 = new int[count2];
        System.arraycopy(arr2, arr2.length - count2, temp2, 0, count2);
        System.out.println(Arrays.toString(temp2));
        System.arraycopy(arr2, 0, arr2, count2, arr2.length - count2);
        System.out.println(Arrays.toString(arr2));
        System.arraycopy(temp2, 0, arr2, 0, count2);
        System.out.println(Arrays.toString(arr2));

    }
}
