package _14_InterviewQuestions.Arrays;

public class LargestAndSmallestInArray {
    public static void main(String[] args) {
        int[] arr = {5,6,8,43,7,3,1};
        int largest = arr[0];
        int smallest = arr[0];
        for (int i=0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

        System.out.println("Largest: "+ largest+ " Smallest: "+ smallest);
    }
}
