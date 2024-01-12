package it.units.sdm;

public class Television {

    private final String model;

    private boolean on;
    private int channel;
    private int volume;

    public Television(String model, int channel, int volume) {
        this(model);
        this.channel = channel;
        this.volume = volume;
    }

    public Television(String model) {
        this.model = model;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int increaseVolume() {
        var newVolume = volume + 1;
        volume = newVolume;
        return volume;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }
}
