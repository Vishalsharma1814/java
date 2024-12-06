package _14_InterviewQuestions.ControlStructureAndLoops;

public class SumOfDigits {
    public static void main(String[] args) {
        int number =  145;
        int sum = 0;
        while(number != 0){
            int digit = number%10;
            sum += digit;
            number = number/10;
        }
        System.out.println(sum);
    }
}
