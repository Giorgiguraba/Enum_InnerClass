package ge.Task;

public enum Proffesion {
    SOFTWARE_ENGINEER(100000),
    DOCTOR(200000),
    LAWYER(150000),
    TEACHER(60000);

    private final int averageSalary;

    private Proffesion(int averageSalary) {
        this.averageSalary = averageSalary;
    }

    public int getAverageSalary() {
        return averageSalary;
    }
}
