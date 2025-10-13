package it.units.sdm;

public class StringStack {

    private final GeneralizedStack data = new GeneralizedStack();

    public static void main(String[] args) {
        StringStack stack = new StringStack();
        stack.push("Hello,");
        stack.push("World!");
        // the next line causes a compilation error, we cannot push an Object into a String stack
        //stack.push(new Object());
        while (stack.getSize() > 0) {
            String text = stack.pop();
            IO.println(text);
        }
    }

    public int getSize() {
        return data.getSize();
    }

    public String top() {
        return (String) data.top();
    }

    public String pop() {
        return (String) data.pop();
    }

    public void push(String value) {
        data.push(value);
    }
}
