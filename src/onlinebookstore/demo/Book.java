package onlinebookstore.demo;

public class Book {

    private String title;
    private int isbn;
    private double price;
    private String authorname;


    public Book(String title, int isbn, double price, String authorname) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.authorname = authorname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn=" + isbn +
                ", price=" + price +
                ", authorname='" + authorname + '\'' +
                '}';
    }


}

