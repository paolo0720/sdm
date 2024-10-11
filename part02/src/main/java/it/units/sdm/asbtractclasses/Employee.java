package it.units.sdm.asbtractclasses;

public abstract class Employee {

    protected abstract int baseSalary();

    public int totalSalary(int bonus) {
        return baseSalary() + bonus;
    }
}
