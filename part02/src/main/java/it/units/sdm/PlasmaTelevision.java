package it.units.sdm;

public class PlasmaTelevision extends Television {

    private double usageHours;
    private long startTime;

    public PlasmaTelevision(String model, double usageHours) {
        super(model);
        this.usageHours = usageHours;
    }

    public PlasmaTelevision(String model) {
        this(model, 0);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        startTime = System.currentTimeMillis();
    }

    @Override
    public void turnOff() {
        super.turnOff();
        var endTime = System.currentTimeMillis();
        usageHours += (endTime - startTime) / (1000.0 * 60 * 60);
    }

    public double getUsageHours() {
        return usageHours;
    }
}
