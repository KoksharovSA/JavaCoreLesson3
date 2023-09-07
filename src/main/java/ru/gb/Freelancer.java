package ru.gb;

public class Freelancer extends Employee{
    public Freelancer(String lastName, String surName, double salary) {
        super(lastName, surName, salary);
    }

    @Override
    double calculationAverageMonthlySalary() {
        return this.getSalary() * 20.8 * 8;
    }
}
