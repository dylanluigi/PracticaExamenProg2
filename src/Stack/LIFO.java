package Stack;

import java.util.Scanner;

public class LIFO {
    private int maxSize; // Maximum size of the stack
    private int top; // Index of the top element in the stack
    private int[] stackArray; // Array to store the stack elements

    public LIFO(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1; // Stack is initially empty
        this.stackArray = new int[maxSize];
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println(value + " pushed to the stack.");
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop an element.");
            return -1; // Return a default value indicating failure
        }
        int poppedValue = stackArray[top--];
        System.out.println(poppedValue + " popped from the stack.");
        return poppedValue;
    }

    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Elements in the stack:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }

    public static void main(String[] args) {
        LIFO stack = new LIFO(5);

        Scanner s = new Scanner(System.in);
        int i;
        while( (i = s.nextInt())!=-1){
            if (i==0){
                stack.pop();
            }else{
                stack.push(i);
                stack.printStack();
            }
        }

    }
}

