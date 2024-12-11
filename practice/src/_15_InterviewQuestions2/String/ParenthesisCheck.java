package _15_InterviewQuestions2.String;

import java.util.Stack;

public class ParenthesisCheck {
    public static boolean isBalanced(String str) {
        Stack<Character> characters = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                characters.push(c);
            } else if (c == ')') {
                if (characters.isEmpty()) {
                    return false;
                }
                characters.pop();
            }
        }
        return characters.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("()"));
        System.out.println(isBalanced("(()"));
    }
}
