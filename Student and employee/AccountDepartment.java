public class AccountsDepartment extends Employee {
    @Override
    public double calculateSalary() {
        // Salary calculation logic specific to Accounts Department
        // ...
        return super.calculateSalary();
    }
}

class ITDepartment extends Employee {
    @Override
    public double calculateSalary() {
        // Salary calculation logic specific to IT Department
        // ...
        return super.calculateSalary();
    }
}

class HRDepartment extends Employee {
    @Override
    public double calculateSalary() {
        // Salary calculation logic specific to HR Department
        // ...
        return super.calculateSalary();
    }
}
