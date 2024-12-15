package _14_InterviewQuestions.Arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void mergeSortedArray(int[] a, int[] b) {
        int[] c = new int[a.length+b.length];
        int i=0, j=0, k=0;
        while(i<a.length && j < b.length){
            if(a[i] <= b[j]){
                c[k++] = a[i++];
            }else{
                c[k++] = b[j++];
            }
        }
        while(i < a.length){
            c[k++] = a[i++];
        }
        while(j < b.length){
            c[k++] = b[j++];
        }
        System.out.println(Arrays.toString(c));
    }

    public static void main(String[] args) {
        mergeSortedArray(new int[]{1,2,6,8,9}, new int[]{2,3,5,7,9});
    }
}
