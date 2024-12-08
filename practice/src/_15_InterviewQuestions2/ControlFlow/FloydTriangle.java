package _15_InterviewQuestions2.ControlFlow;

public class FloydTriangle {
    public static void main(String[] args) {
        int rows = 10;
        int currentNum = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(currentNum + " ");
                currentNum++;
            }
            System.out.println();
        }
    }
}
