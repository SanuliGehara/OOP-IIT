public class Director {
    private String name;
    private String surname;
    private int numDirectedMovie;
    private Date dob;

    public Director(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumDirectedMovie() {
        return numDirectedMovie;
    }

    public void setNumDirectedMovie(int numDirectedMovie) {
        this.numDirectedMovie = numDirectedMovie;
    }

    public Date getDoB() {
        return dob;
    }

    public void setDoB(Date dob) {
        this.dob = dob;
    }

    public String toString() {
        return "Director [ name = " + this.name + ", surname = " + this.surname + ", dob = " + this.dob +
                ", movies directed = " + this.numDirectedMovie + "]";
    }
}
