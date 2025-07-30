class Television {
    String model;
    boolean on;
    int channel;
    int volume;

    Television(String model, int channel, int volume) {
        this(model);
        this.channel = channel;
        this.volume = volume;
    }

    Television(String model) {
        this.model = model;
    }

    void setVolume(int volume) {
        this.volume = volume;
    }

    int increaseVolume() {
        var newVolume = volume + 1;
        volume = newVolume;
        return volume;
    }

}
