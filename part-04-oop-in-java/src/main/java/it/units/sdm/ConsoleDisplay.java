package it.units.sdm;

class ConsoleDisplay implements Display {
    @Override
    public void display(String text) {
        System.out.println(text);
    }
}
