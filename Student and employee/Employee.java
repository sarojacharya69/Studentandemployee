public class Employee {
	public static void main(string[]args{
    private int eno;
    private String ename;
    private String dname;
    
    public int getEno() {
        return eno;
    }
    
    public void setEno(int eno) {
        this.eno = eno;
    }
    
    public String getEname() {
        return ename;
    }
    
    public void setEname(String ename) {
        this.ename = ename;
    }
    
    public String getDname() {
        return dname;
    }
    
    public void setDname(String dname) {
        this.dname = dname;
    }
    
    public double calculateSalary() {
        double salary = 0.0;
        
        // Calculate salary based on department name
        if (dname.equalsIgnoreCase("Accounts Department")) {
            // Salary calculation logic for Accounts Department
            salary = 5000.0;
        } else if (dname.equalsIgnoreCase("IT Department")) {
            // Salary calculation logic for IT Department
            salary = 6000.0;
        } else if (dname.equalsIgnoreCase("HR Department")) {
            // Salary calculation logic for HR Department
            salary = 7000.0;
        }
        
        return salary;
    }
}
