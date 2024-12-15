package _14_InterviewQuestions.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelsCount {
    public static void main(String[] args) {
        String str = "a quick brown fox jumps over a lazy dog".toLowerCase();

        List<Character> vowels = new ArrayList<>();
        vowels.addAll(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        int vowelsCount = 0;
        int consonantCount = 0;
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] != ' ') {
                if (vowels.contains(charArr[i])) {
                    vowelsCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println(vowelsCount + " " + consonantCount);
    }
}
