package _15_InterviewQuestions2.Multithreading.Synchronization;

public class TestClass {
    public static void main(String[] args) throws InterruptedException {
        SynchronizedClass synchronizedClass = new SynchronizedClass();

        ThreadClass t1 = new ThreadClass(synchronizedClass);
        ThreadClass t2 = new ThreadClass(synchronizedClass);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(synchronizedClass.getCount());
    }
}
