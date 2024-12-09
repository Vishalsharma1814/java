package _14_InterviewQuestions.ControlStructureAndLoops;

public class FloydTriangle {
    public static void main(String[] args) {
        int rows = 5;
        int num=1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}

