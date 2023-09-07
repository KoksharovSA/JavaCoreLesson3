package ru.gb;

public class Worker extends Employee{
    public Worker(String lastName, String surName, double salary) {
        super(lastName, surName, salary);
    }

    @Override
    double calculationAverageMonthlySalary() {
        return this.getSalary();
    }
}
