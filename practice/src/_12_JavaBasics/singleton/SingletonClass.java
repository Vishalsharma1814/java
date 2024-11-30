package _12_JavaBasics.singleton;

public class SingletonClass {
    private static final SingletonClass SingletonClass = new SingletonClass();

    public static SingletonClass getInstance(){
        return SingletonClass;
    }

}
