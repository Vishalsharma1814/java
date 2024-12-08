package _14_InterviewQuestions.String;

import java.util.Map;
import java.util.TreeMap;

public class OccurrenceCount {
    public static void main(String[] args) {
        String str = "xjahfcab diaodchsau iydhawoubdakjsn cakudywaioshdncljadnl";

        char[] charArr = str.toCharArray();
        Map<Character, Integer> occurrences = new TreeMap<>();
        for(int i=0; i < charArr.length; i++){
            if(charArr[i] != ' '){
                occurrences.put(charArr[i], occurrences.getOrDefault(charArr[i], 0)+1);
            }
        }
        System.out.println(occurrences);
    }
}
