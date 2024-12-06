package _12_JavaBasics.multithreading.basicThread;

public class ThreadByClass extends Thread{
    @Override
    public void run() {
        System.out.println("Thread Running: "+ Thread.currentThread().getName());
    }
}
