package _15_InterviewQuestions2.Multithreading.Synchronization;

public class ThreadClass extends Thread {
    private SynchronizedClass counter;

    public ThreadClass(SynchronizedClass counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        super.run();
        for(int i=0; i < 1000; i++){
            this.counter.increment();
        }
    }
}
