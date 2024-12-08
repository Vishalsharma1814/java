package _15_InterviewQuestions2.ControlFlow;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1289));
        System.out.println(sumOfDigits(123));
    }
    public static int sumOfDigits(int number){
        int sum = 0;
        while(number !=0){
            int digit = number%10;
            sum += digit;
            number = number/10;
        }
        return sum;
    }
}
