package _15_InterviewQuestions2.ControlFlow;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        int number = 10;
        int sum = 0;
        if (number > 0) {
            for (int i = 0; i < number; i++) {
                System.out.print(sum+" ");
                sum += i;
            }
            System.out.println();
        }
        System.out.println("Total: "+sum);
    }
}
