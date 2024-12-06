package _14_InterviewQuestions.ControlStructureAndLoops;

public class NumberPalindrome {
    public static void main(String[] args) {
        int num1 = 1001;
        int num2 = 1245;
        System.out.println(checkPalindrome(num1));
        System.out.println(checkPalindrome(num2));
    }
    public static boolean checkPalindrome(int num){
        int reversed = 0;
        int num1 = num;
        while (num != 0){
            int digit = num %10;
            reversed = reversed*10+digit;
            num = num/10;
        }
        return num1 == reversed;
    }
}
