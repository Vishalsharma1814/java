package _15_InterviewQuestions2.Multithreading.CreateThread;

public class ThreadByClass extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Thread by class is running "+ Thread.currentThread());
    }
}
