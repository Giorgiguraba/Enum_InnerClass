package ge.Task;

public class Employee {
    private String name;
    private Proffesion proffesion;
    public Employee(String name, Proffesion proffesion){
        this.name = name;
        this.proffesion = proffesion;
    }
    public String getName(){
        return name;
    }
    public Proffesion getProffesion(){
        return proffesion;
    }

    public String toAvvarageSalary(){
        if(this.getSalary() < getAuditSalary){
            return getSalary() + "is lower then" + getAuditSalary;
        }else {
            return null;
        }
    }
}
