package _15_InterviewQuestions2.ControlFlow;
//An Armstrong number (also known as a narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
public class ArmStrongCheck {
    public static void main(String[] args) {
        System.out.println(checkIfArmStrong(153));
        System.out.println(checkIfArmStrong(123));

    }
    public static boolean checkIfArmStrong(int number){
        int total =0;
        for(int i =0; i< String.valueOf(number).length(); i++){
            total += Math.pow(Integer.parseInt(String.valueOf(number).substring(i,i+1)), String.valueOf(number).length()) ;
        }
        System.out.println(total);
        return number == total;
    }
}
