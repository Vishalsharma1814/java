package _14_InterviewQuestions.String;

public class OnlyDigits {
    public static void main(String[] args) {
        String str = "123";
        String str2 = "abc123";
        try{
            Integer.parseInt(str2);
            System.out.println("Contains digits only");
        }catch (Exception e){
            System.out.println("Contains alphabets");
        }
    }
}
