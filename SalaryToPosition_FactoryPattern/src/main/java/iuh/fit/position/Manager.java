package iuh.fit.position;

class Manager extends Employee {
    private static final double ALLOWANCE = 3000000; // Phụ cấp

    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + ALLOWANCE;
    }
}



