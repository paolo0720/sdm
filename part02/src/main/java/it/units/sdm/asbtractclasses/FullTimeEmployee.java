package it.units.sdm.asbtractclasses;

public class FullTimeEmployee extends Employee {

    private final int monthlySalary;

    public FullTimeEmployee(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    protected int baseSalary() {
        return monthlySalary;
    }
}
