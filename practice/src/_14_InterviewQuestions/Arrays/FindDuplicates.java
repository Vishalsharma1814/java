package _14_InterviewQuestions.Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,10,2,3,2,5,7,9,1};

        Set<Integer> arrSet = new HashSet<>();
        for(int i =0; i < arr.length; i++){
            if(!arrSet.add(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }
}
