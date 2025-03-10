package iuh.fit.position;

public class HeadTeacher extends Employee{
    private static final double ALLOWANCE = 2000000;

    public HeadTeacher(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + ALLOWANCE;
    }
}