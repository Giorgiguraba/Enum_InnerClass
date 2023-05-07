package ge.Task;

public class CompanyJob {
    private String company;
    private double salary;
    private Proffesion proffesion;

    public CompanyJob(String company, double salary, Proffesion proffesion) {
        this.company = company;
        this.salary = salary;
        this.proffesion = proffesion;
    }

    public String getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }
}
