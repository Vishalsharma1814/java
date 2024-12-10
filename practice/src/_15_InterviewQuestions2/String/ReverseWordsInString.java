package _15_InterviewQuestions2.String;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "My Name is Vishal Sharma";

        String[] strings = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            StringBuilder stringBuilder1 = new StringBuilder(strings[i]).reverse();
            stringBuilder.append(stringBuilder1).append(" ");
        }
        System.out.println(stringBuilder);
    }
}
