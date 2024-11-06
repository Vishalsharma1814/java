package _12_JavaBasics.CustomException;

public class ExceptionTestClass {
    public static void validate(Integer value) throws InvalidAgeException{
        if(value < 18){
            throw new InvalidAgeException("Age is not valid!");
        }else{
            System.out.println("Age is valid!");
        }
    }

    public static void main(String[] args) {
        try{
          validate(20);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
