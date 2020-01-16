package org.sunrain.study.basics.stack;

public class QCStack {

    private int size;

    private int array[];

    private int current = -1;

    public QCStack(int size) {
        this.size = size;
        this.array = new int[size];
    }

    public void push(int value) throws Exception {
        if (current == size) {
            throw new Exception("Stack is full");
        }
        array[++current] = value;
    }

    public int pop() throws Exception {
        if (current == -1) {
            throw new Exception("Stack is empty");
        }
        return array[current--];
    }

    public int peek() throws Exception {
        if (current > 0) {
            return array[current];
        }
        throw new Exception("Stack is empty");
    }

    public boolean isFull() {
        return current == size - 1;
    }

    public boolean isEmpty() {
        return current == -1;
    }
}
