package ge.Task;

public class Statics extends Employee{
    private Employee employee;
    private Hired hired;
    private double avvarageSalary;
    private final double getIttSalary = 3870;
    private final double getAuditSalary = 870;
    public Statics(Employee employee, Hired hired){
        this.employee = employee;
        this.hired = hired;
    }

    public double getGetIttSalary() {
        return getIttSalary;
    }

    public double getGetAuditSalary() {
        return getAuditSalary;
    }
}


