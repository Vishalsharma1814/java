package _12_JavaBasics.multithreading.basicThread;

public class ThreadByInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable Running: "+ Thread.currentThread().getName());
    }
}
