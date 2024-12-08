package _14_InterviewQuestions.DesignPatterns.Singleton;

public class SingletonClass {
    private static SingletonClass instanse;

    private SingletonClass(){}

    public String response(){
        return "Working!";
    }

    public static SingletonClass getInstance(){
        if(instanse == null){
            instanse = new SingletonClass();
        }
        return instanse;
    }
}
