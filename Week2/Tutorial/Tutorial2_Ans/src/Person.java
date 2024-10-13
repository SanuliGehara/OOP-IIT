public class Person {
    private String name;
    private String surname;
    private int age;

    // Constructor with name parameter
    public Person(String name) {
        this.name = name;
    }

    // method to display the name
    public void displayName() {
        System.out.println("Name : " + name);
    }

    // Set name method
    void setSurname(String surname) {
        this.surname = surname;
    }

    // Set age method
    void  setAge(int age) {
        this.age = age;
    }

    // getters
    String getSurName() {
        return this.surname;
    }

    int getAge() {
        return this.age;
    }




}
