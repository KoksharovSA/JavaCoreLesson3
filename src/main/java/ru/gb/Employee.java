package ru.gb;

public abstract class Employee implements Comparable<Employee>{
    private String lastName;
    private String surName;

    private double salary;

    public double getAverageMonthlySalary() {
        return calculationAverageMonthlySalary();
    }


    public Employee(String lastName, String surName, double salary) {
        this.lastName = lastName;
        this.surName = surName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", surName='" + surName + '\'' +
                ", AverageMonthlySalary=" + getAverageMonthlySalary() +
                '}';
    }

    public Employee() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    abstract double calculationAverageMonthlySalary();

    @Override
    public int compareTo(Employee o) {
        return this.lastName.compareTo(o.lastName);
    }
}
