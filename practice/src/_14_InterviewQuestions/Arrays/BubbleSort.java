package _14_InterviewQuestions.Arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,6,1,7,2,3,9,8};
        Arrays.stream(bubbleSort(arr)).forEach(System.out::println);
    }
    public static int[] bubbleSort(int[] arr){
        for(int i =0; i < arr.length; i++){
            for(int j =0; j < arr.length -1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
