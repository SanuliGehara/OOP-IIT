package exc2;

public class Teacher extends Person{
    private double salary;
    private String subject;

    public Teacher() {

    }

    public Teacher(double salary, String subject) {
        super();
        this.salary = salary;
        this.subject = subject;
    }
}
