package _15_InterviewQuestions2.Exception.CustomException;

public class InvalidAgeException extends ArithmeticException{
    public InvalidAgeException(String message){
        super(message);
    }
}
