package _15_InterviewQuestions2.ControlFlow;

public class Palindrome {
    public static void main(String[] args) {
        int i = 101;
        int j = 123245;
        System.out.println(checkNumberPalindrome(i));
        System.out.println(checkNumberPalindrome(j));

        String s1 = "naman";
        String s2 = "vishal";
        System.out.println("n a m a n".replaceAll(" ",""));

        System.out.println(checkStringPalindrome(s1));
        System.out.println(checkStringPalindrome(s2));
    }
    public static boolean checkNumberPalindrome(int num){
        int originalNum = num;
        int reversedNum = 0;
        while(num != 0){
            int n = num%10;
            reversedNum = reversedNum*10+n;
            num = num/10;
        }

        return originalNum == reversedNum;
    }
    public static boolean checkStringPalindrome(String str){
        char[] charArr = str.trim().replaceAll(" ","").toCharArray();
        for(int i=0; i < Math.floor(charArr.length)/2; i++){
            if(charArr[i] != charArr[charArr.length-i-1]){
                return false;
            }
        }
        return true;
    }
}
