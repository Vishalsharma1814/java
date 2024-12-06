package _12_JavaBasics.multithreading.basicThread;

public class ThreadMain {
    public static void main(String[] args) {
        ThreadByClass t1 = new ThreadByClass();
        Thread t2 = new Thread(new ThreadByInterface());

        t1.start();
        t2.start();
    }
}
