package _4_SortingAndSearching;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int[] array){

        for(int i=0; i < array.length-1; i++){
            int minIndex =i;
            for (int j = i; j < array.length-1; j++) {
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String[] arr = new String[s.length()-k+1];
        for(int i=0; i<= s.length()- k; i++){
            arr[i] = s.substring(i,k+i);
        }
        for (String a:
             arr) {
            System.out.println(a);
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        selectionSort(new int[]{5,1,8,4,6,3,9});
//        Scanner scan = new Scanner(System.in);
//        String s = scan.next();
//        int k = scan.nextInt();
//        scan.close();
//
//        System.out.println(getSmallestAndLargest(s, k));
    }
}
