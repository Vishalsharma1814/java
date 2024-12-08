package _15_InterviewQuestions2.Multithreading.CreateThread;

import _12_JavaBasics.multithreading.basicThread.ThreadByClass;
import _12_JavaBasics.multithreading.basicThread.ThreadByInterface;

public class TestClass{
    public static void main(String[] args) {
        ThreadByClass t1 = new ThreadByClass();
        Thread t2 = new Thread(new ThreadByInterface());
        t1.start();
        t2.start();
    }

}
