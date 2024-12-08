package _15_InterviewQuestions2.Multithreading.Synchronization;

public class SynchronizedClass {
    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
}
