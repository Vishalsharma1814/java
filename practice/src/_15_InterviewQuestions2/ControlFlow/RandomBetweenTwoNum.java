package _15_InterviewQuestions2.ControlFlow;

public class RandomBetweenTwoNum {
    public static void main(String[] args) {
        int a=2;
        int b = 10;

        System.out.println((int) (Math.random()*b-a+1) + a);
    }
}
