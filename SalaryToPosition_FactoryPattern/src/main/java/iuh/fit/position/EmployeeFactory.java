package iuh.fit.position;

public class EmployeeFactory {
    public static Employee createEmployee(String role, String name, double baseSalary) {
        switch (role.toLowerCase()) {
            case "manager":
                return new Manager(name, baseSalary);
            case "headteacher":
                return new HeadTeacher(name, baseSalary);
            case "viceprincipal":
                return new VicePrincipal(name, baseSalary);
            default:
                throw new IllegalArgumentException("Chức vụ không hợp lệ!");
        }
    }
}
