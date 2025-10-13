package it.units.sdm;

import java.util.Arrays;

public class GeneralizedStack {

    private Object[] data = new Object[0];

    public static void main(String[] args) {
        GeneralizedStack stack = new GeneralizedStack();

        stack.push("Hello,");
        stack.push("World!");
        stack.push(new Object());
        while (stack.getSize() > 0) {
            String text = (String) stack.pop();
            IO.println(text);
        }
    }

    public int getSize() {
        return data.length;
    }

    public Object top() {
        return data[data.length - 1];
    }

    public Object pop() {
        Object result = top();
        data = Arrays.copyOf(data, data.length - 1);
        return result;
    }

    public void push(Object value) {
        data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = value;
    }

}


