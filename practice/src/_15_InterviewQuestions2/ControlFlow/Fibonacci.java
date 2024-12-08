package _15_InterviewQuestions2.ControlFlow;

public class Fibonacci {
    public static void main(String[] args) {
        int num = 10;
        int first = 0, second = 1;
        for (int i = 0; i < num; i++) {
            System.out.print(first + " ");
            int n = first + second;
            first = second;
            second = n;
        }
    }
}
