package _14_InterviewQuestions.ControlStructureAndLoops;

public class StringPalindrome {
    public static void main(String[] args) {
        String input = "naman";
        String input2 = "Vishal";

        System.out.println(checkPalindrome(input.toCharArray()));
        System.out.println(checkPalindrome(input2.toCharArray()));
    }

    public static boolean checkPalindrome(char[] input) {
        for (int i = 0; i < input.length -1; i++) {
            if(input[i] != input[input.length -i -1]){
                return false;
            }
        }
        return true;
    }
}
