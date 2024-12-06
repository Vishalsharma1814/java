package _14_InterviewQuestions.String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabccdeffsss";
        char[] str2 = str.toCharArray();
        Character[] s3 = new Character[str2.length];
        for (int i = 0; i < s3.length; i++) {
            s3[i] = str2[i];
        }
        Set<Character> noDuplicates = new HashSet<>(Arrays.asList(s3));
        System.out.println(noDuplicates);
    }
}
