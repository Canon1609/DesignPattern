package iuh.fit.position;

public class VicePrincipal extends Employee {
    private static final double ALLOWANCE = 2500000;

    public VicePrincipal(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + ALLOWANCE;
    }
}
