package _12_JavaBasics.assessment;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getMaxValue' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int getMaxValue(List<Integer> arr) {
        // Write your code here
        if(arr.size() > 0){
            for(int i =0; i < arr.size()-1; i ++){
                for(int j = 0; j < arr.size() -1; i++){
                    if(arr.get(j) > arr.get(j+1)){
                        int temp = arr.get(j);
                        arr.set(j, arr.get(j +1));
                        arr.set(j+1, temp);
                    }
                }
            }
            for(int i= 0; i < arr.size() -1; i++){
                if(arr.get(i) > i+1){
                    arr.set(i, i+1);
                }
            }
            return arr.get(arr.size() -1);
        }else{
            return 0;
        }
    }
}