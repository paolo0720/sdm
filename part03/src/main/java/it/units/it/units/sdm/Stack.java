package it.units.it.units.sdm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Stack<T> {

    private Class<T> type;
    protected T[] data = (T[]) Array.newInstance(type, 0);

    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Hello,");
        stringStack.push("World!");
        // the next line causes a compilation error, we cannot push an Object into a String stack
        //stringStack.push(new Object());
        while (stringStack.getSize() > 0) {
            String text = stringStack.pop();
            System.out.println(text);
        }
    }

    public int getSize() {
        return data.length;
    }

    public T top() {
        return data[data.length - 1];
    }

    public T pop() {
        T result = data[data.length - 1];
        data = Arrays.copyOf(data, data.length - 1);
        return result;
    }

    public void push(T value) {
        data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = value;
    }

    public void pushAll(Stack<? extends T> other) {
        while (other.getSize() > 0) {
            push(other.pop());
        }
    }
}
