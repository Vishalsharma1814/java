package _12_JavaBasics.CustomException;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(String exception){
        super(exception);
    }
}
