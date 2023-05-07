package ge.Task;

public class Person {
    private String name;
    private Proffesion proffesion;

    public Person(String name, Proffesion proffesion) {
        this.name = name;
        this.proffesion = proffesion;
    }

    public String getName() {
        return name;
    }

    public Proffesion getProffesion() {
        return proffesion;
    }
}
