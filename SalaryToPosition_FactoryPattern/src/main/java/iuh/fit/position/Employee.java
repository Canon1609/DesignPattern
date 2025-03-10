package iuh.fit.position;

abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void printSalary() {
        System.out.println(name + ": Lương = " + calculateSalary());
    }
}