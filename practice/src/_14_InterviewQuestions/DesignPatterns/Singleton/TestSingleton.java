package _14_InterviewQuestions.DesignPatterns.Singleton;

public class TestSingleton {
    public static void main(String[] args) {
        SingletonClass s = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();
        System.out.println(s == s2); // will return true as bot variables sharing same object
    }
}
