package lk.sanu.oop;

import java.util.List;

public class Student extends Person{
    private String studentId;

    public Student(String firstName, String lastName, String address, String email, String studentId) {
        super(firstName, lastName, address, email);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    // Enroll to the list of modules
    public void enrollModules(List<String> modules) {
        for (String module: modules) {
            super.addModule(module);
        }
    }
}
