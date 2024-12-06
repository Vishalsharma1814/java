package _14_InterviewQuestions.Arrays;

import java.util.Arrays;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {10,65,7,4,99,32,66};
        System.out.println(arr.length > 1 ? "Second largest is: "+secondLargest(arr) : "Atlest two elements are required");

    }
    public static int secondLargest(int[] arr){
        int largest = arr[0];
        int secondLargest = arr[0];
        for(int i=0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] > secondLargest && arr[i] < largest ){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
