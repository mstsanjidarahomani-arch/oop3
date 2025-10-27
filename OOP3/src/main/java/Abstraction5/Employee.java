
package Abstraction5;


abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name; // Set the name
        this.baseSalary = baseSalary; // Set the base salary
    }

    public abstract double calculateSalary();

    public abstract void displayInfo();
} 

    
