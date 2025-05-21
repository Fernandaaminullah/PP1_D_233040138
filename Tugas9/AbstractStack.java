package Tugas9;

public abstract class AbstractStack {
    protected int[] arr;
    protected int top;

    public AbstractStack(int capacity) {
        arr = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top < arr.length - 1) {
            arr[++top] = value;
        }
    }

    public int pop() {
        if (top >= 0) {
            return arr[top--];
        }
        return -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
    
    public boolean isFull() {
        return top == arr.length - 1;
    }
}

