public class Book {
    private String title;
    private double price;
    private int year;
    private String author;

    public Book(String title, double price, int year, String author){
        this.title = title;
        this.price = price;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {return this.title;}

    public double getPrice() {return  this.price;}

    public int getYear() {return year;}

    public String getAuthor() {return author;}

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;}

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: Title= " + title + ", Price= "+ price + ", Year= " + year + ", Author= "+ author;
    }
}
