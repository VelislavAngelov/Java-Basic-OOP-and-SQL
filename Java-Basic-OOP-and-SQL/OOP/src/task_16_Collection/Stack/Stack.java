package task_16_Collection.Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private int arr[];
    private int size;
    private int index = 0;

    public Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {

        if (isFull()) {
            System.out.println("Stack is full");
        }

        arr[index] = element;
        index++;
    }

    public int pop() {

        if (isEmpty()) {
            System.out.println("Is empty");
        }
        return arr[--index];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public boolean isFull() {
        return index == size;
    }

    public int size() {
        return index;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
