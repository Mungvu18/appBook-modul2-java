package book;

import java.util.Comparator;
import java.util.Scanner;

public class Book implements Comparator<Book> {
    private String bookCode;
    private String name;
    private double price;
    private String author;

    public Book() {
    }

    public Book(String bookCode, String name, double price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public void inputInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter bookCode");
        bookCode = input.nextLine();
        System.out.println("Enter name");
        name = input.nextLine();
        System.out.println("Enter price");
        price = input.nextDouble();
        System.out.println("Enter author");
        author = input.nextLine();
        input.nextLine();
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookCode='" + bookCode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'';
    }


    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        double percent = 0;
        this.price = price;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int compare(Book o1, Book o2) {
        int cmp = o1.getAuthor().compareTo(o2.getAuthor());
        return cmp > 0 ? -1 : 1;
    }
}
