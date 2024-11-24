package lk.sanu.oop;

import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private List<String> module;

    Person(String firstName, String lastName, String address, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", module=" + module +
                '}';
    }

    public List<String > getModule() {
        return module;
    }

    public void setModule(List<String> module) {
        this.module = module;
    }

    // Add a module to the module list
    public void addModule(String module) {
        this.module.add(module);
    }

//    public void viewCourse() {
//        System.out.println("Course: " );
//    }
//
//    public void viewModule() {
//
//    }
}
