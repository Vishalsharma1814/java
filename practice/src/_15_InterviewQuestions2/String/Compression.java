package _15_InterviewQuestions2.String;

public class Compression {
    public static String compressString(String input){
        if (input == null || input.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int count = 1;
        for(int i=1; i< input.length(); i++){
            if(input.charAt(i) == input.charAt(i-1)){
                count++;
            }else{
                stringBuffer.append(input.charAt(i-1)).append(count);
                count = 1;
            }
        }
        stringBuffer.append(input.charAt(input.length()-1)).append(count);
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String abc = "aaabbcccccdddd";
        System.out.println(compressString(abc));
    }
}
