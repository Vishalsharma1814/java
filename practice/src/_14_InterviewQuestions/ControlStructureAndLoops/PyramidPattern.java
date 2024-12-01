package _14_InterviewQuestions.ControlStructureAndLoops;

public class PyramidPattern {
    public static void main(String[] args) {
        for(int i =0 ; i <= 10; i++){
            for(int j=i; j < 10; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
