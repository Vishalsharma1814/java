package _14_InterviewQuestions.String;

public class Reverse {
    public static void main(String[] args) {
        String str= "Hello World";
        char[] strArr = str.toCharArray();
        for(int i=0; i< str.length()/2; i++){
            char temp = strArr[strArr.length -i -1];
            strArr[strArr.length -i -1] = strArr[i];
            strArr[i] = temp;
        }

        System.out.println(String.valueOf(strArr));
    }
}
