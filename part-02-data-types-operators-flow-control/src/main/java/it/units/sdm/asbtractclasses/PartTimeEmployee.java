package it.units.sdm.asbtractclasses;

public class PartTimeEmployee extends Employee {

    private final int hourlyRate;
    private final int hoursWorked;

    public PartTimeEmployee(int hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    protected int baseSalary() {
        return hourlyRate * hoursWorked;
    }
}
