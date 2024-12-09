package _15_InterviewQuestions2.Exception.CustomException;

public class TestClass {
    public static String validForVoting(int age) throws InvalidAgeException{
        if(age > 18){
            return "Valid Age For Voting";
        }else{
            throw new InvalidAgeException( "Invalid Age For Voting");
        }
    }

    public static void main(String[] args) {
        try {
            validForVoting(12);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
