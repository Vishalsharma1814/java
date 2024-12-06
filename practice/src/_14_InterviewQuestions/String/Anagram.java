package _14_InterviewQuestions.String;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "vishal";
        String s2 = "ihvsla";

        char[] s3 = s1.toCharArray();
        char[] s4 = s2.toCharArray();

        System.out.println(anagram(s3, s4));
    }

    public static boolean anagram(char[] s1, char[] s2) {
        if (s1.length != s2.length) {
            return false;
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        for (int i=0; i < s1.length; i++){
            if(s1[i] != s2[i]){
                return false;
            }
        }
        return true;
    }
}
