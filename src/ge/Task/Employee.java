package ge.Task;

public class Employee{
    private Proffesion proffesion;
    private String name;
    private String sex;
    private double salary;

    public Employee(Proffesion proffesion, String name, String sex, double salary) {
        this.proffesion = proffesion;
        this.name = name;
        this.sex = sex;
        this.salary = salary;
    }

    public Proffesion getProffesion() {
        return proffesion;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "proffesion=" + proffesion +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", salary=" + salary +
                '}';
    }
    //    public String toString(){
//        String personInfo = String.format("%s, %s", getPerson().getName(), person.getProffesion());
//        StringBuilder sb = new StringBuilder();
//        sb.append(String.format(" %s, %f", person, level, salary));
//        return String.format("%s, %s", personInfo, sb.toString());
//    }
}
