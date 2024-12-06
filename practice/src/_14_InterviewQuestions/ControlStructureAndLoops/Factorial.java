package _14_InterviewQuestions.ControlStructureAndLoops;

public class Factorial {
    public static void main(String[] args) {
        int factNum = 5;
        int fact = 1;
        for (int i = 1; i <= factNum; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
