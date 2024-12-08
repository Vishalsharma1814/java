package _15_InterviewQuestions2.ControlFlow;

public class PyramidPattern {
    public static void main(String[] args) {
        int rows =10;
        for(int i=0; i < rows; i++){
            for(int j=i; j < rows; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
