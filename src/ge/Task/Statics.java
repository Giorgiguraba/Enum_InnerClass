package ge.Task;

public class Statics{

    private Statics(){}
    public static void compeareAvvarage(Employee employee){
        if (employee.getSalary() < employee.getProffesion().getAverageSalary()){
            double x = employee.getProffesion().getAverageSalary() - employee.getSalary();
            System.out.println("less then avvarage" + employee.toString() + x);
        }else if(employee.getSalary() == employee.getProffesion().getAverageSalary()) {
            System.out.println("avvarage");
        }else {
            System.out.println("more then avvarage" + employee.toString());
        }
    }
    public static void printSalary(Employee employee){
        System.out.println(employee.getSalary());
    }
}


