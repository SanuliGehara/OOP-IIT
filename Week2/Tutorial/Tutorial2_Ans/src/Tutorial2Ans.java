public class Tutorial2Ans {
    public static void main(String[] args) {
        // Create a person named Ben
        Person person1 = new Person("Ben");
        person1.displayName();

        Person person2 = new Person("Harry");
        person2.setSurname("Jones");
        person2.setAge(18);
        person2.displayName();
        System.out.println("Surname: " + person2.getSurName() + ",\tage: "+ person2.getAge());

        Person person3 = new Person("Marie");
        person3.setSurname("Roys");
        person3.setAge(23);
        person3.displayName();
        System.out.println("Surname: " + person3.getSurName() + ",\tage: "+ person3.getAge());

        Person person4 = new Person("John");
        person4.setSurname("Doe");
        person4.setAge(27);
        person4.displayName();
        System.out.println("Surname: " + person4.getSurName() + ",\tage: "+ person4.getAge());
    }
}
