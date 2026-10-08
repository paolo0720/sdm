package it.units.sdm.exercises.solution;

import java.util.Arrays;

public class MyList implements List {
    private String[] data = new String[0];

    @Override
    public String[] getValues() {
        return Arrays.copyOf(data, data.length);
    }

    @Override
    public void add(String value) {
        String[] newData = new String[data.length + 1];
        System.arraycopy(data, 0, newData, 0, data.length);
        newData[newData.length - 1] = value;
        this.data = newData;
    }

    @Override
    public void insert(int index, String value) {
        String[] newData = new String[data.length + 1];
        System.arraycopy(data, 0, newData, 0, index);
        newData[index] = value;
        System.arraycopy(data, index, newData, index + 1, data.length - index);
        this.data = newData;
    }

    @Override
    public void remove(int index) {
        String[] newData = new String[data.length - 1];
        System.arraycopy(data, 0, newData, 0, index);
        System.arraycopy(data, index, newData, index, data.length - index - 1);
        this.data = newData;
    }
}

