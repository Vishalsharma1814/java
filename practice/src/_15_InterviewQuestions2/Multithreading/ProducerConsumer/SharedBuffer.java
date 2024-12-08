package _15_InterviewQuestions2.Multithreading.ProducerConsumer;

class SharedBuffer {
    private int data;
    private boolean isEmpty = true;

    // Produce an item
    public synchronized void produce(int item) throws InterruptedException {
        while (!isEmpty) {
            wait(); // Wait until the buffer is empty
        }
        data = item;
        isEmpty = false;
        System.out.println("Produced: " + item);
        notify(); // Notify the consumer
    }

    // Consume an item
    public synchronized int consume() throws InterruptedException {
        while (isEmpty) {
            wait(); // Wait until there's an item to consume
        }
        isEmpty = true;
        System.out.println("Consumed: " + data);
        notify(); // Notify the producer
        return data;
    }
}
