package _15_InterviewQuestions2.Multithreading.CreateThread;

public class ThreadByInterface implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running "+ Thread.currentThread());
    }
}
