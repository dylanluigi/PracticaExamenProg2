package Stack;
import java.util.Scanner;

public class CircularQueue {
    private final int maxSize; // Maximum size of the queue
    private int front; // Index of the front element in the queue
    private int rear; // Index of the rear element in the queue
    private final int[] queueArray; // Array to store the queue elements
    private int currentSize; // Current number of elements in the queue

    public CircularQueue(int maxSize) {
        this.maxSize = maxSize;
        this.front = 0; // Queue is initially empty, front is set to 0
        this.rear = -1; // Queue is initially empty, rear is set to -1
        this.queueArray = new int[maxSize];
        this.currentSize = 0;
    }

    public void enqueue(int value) {
        if (currentSize == maxSize) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % maxSize; // Calculate the new rear index using modulo operation
        queueArray[rear] = value; // Insert the value at the new rear position
        currentSize++;
        System.out.println(value + " enqueued to the queue.");
    }

    public int dequeue() {
        if (currentSize == 0) {
            System.out.println("Queue is empty. Cannot dequeue an element.");
            return -1; // Return a default value indicating failure
        }
        int dequeuedValue = queueArray[front]; // Get the value at the front index
        front = (front + 1) % maxSize; // Move the front index to the next position using modulo operation
        currentSize--;
        System.out.println(dequeuedValue + " dequeued from the queue.");
        return dequeuedValue;
    }

    public void printQueue() {
        if (currentSize == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Elements in the queue:");
        int count = 0;
        int i = front;
        while (count < currentSize) { // Iterate over the elements in the queue
            System.out.println(queueArray[i]);
            i = (i + 1) % maxSize; // Move to the next position using modulo operation
            count++;
        }
    }

    public static void main(String[] args) {
        CircularQueue stack = new CircularQueue(5);

        Scanner s = new Scanner(System.in);
        int i;
        while( (i = s.nextInt())!=-1){
            if (i==0){
                stack.dequeue();
            }else{
                stack.enqueue(i);
                stack.printQueue();
            }
        }
    }
}
