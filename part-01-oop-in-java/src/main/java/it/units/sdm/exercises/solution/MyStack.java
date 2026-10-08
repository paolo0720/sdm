package it.units.sdm.exercises.solution;

import java.util.Arrays;

public class MyStack implements Stack {

    private String[] data = new String[0];

    public String[] getValues() {
        return Arrays.copyOf(data, data.length);
    }

    public void push(String value) {
        String[] newData = new String[data.length + 1];
        System.arraycopy(data, 0, newData, 0, data.length);
        newData[newData.length - 1] = value;
        this.data = newData;
    }

    public String pop() {
        String value = top();
        String[] newData = new String[data.length - 1];
        System.arraycopy(data, 0, newData, 0, newData.length);
        this.data = newData;
        return value;
    }
}
