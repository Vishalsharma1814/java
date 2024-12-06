package _14_InterviewQuestions.Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,65,7,4,99,32,66};

        for(int i =0; i < Math.floor(arr.length)/2 -1; i++){
            int temp = arr[arr.length -i-1];
            arr[arr.length -i -1] = arr[i];
            arr[i] = temp;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
