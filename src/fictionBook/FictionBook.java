package fictionBook;

import book.Book;
import interFaceDiscount.Discount;

import java.util.Scanner;

public class FictionBook extends Book implements Discount {
    String category;
    double promotionalPrice;

    public FictionBook() {
    }

    public FictionBook(String bookCode, String name, double price, String author, String category, double promotionalPrice) {
        super(bookCode, name, price, author);
        this.category = category;
        this.promotionalPrice = promotionalPrice;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter category");
        category = sc.nextLine();
        System.out.println("Enter promotionalPrice");
        promotionalPrice = sc.nextDouble();
        System.out.println("-------------------------");
    }

    @Override
    public String toString() {
        System.out.println("enter Fictionbook");
        String str = super.toString();
        str += ", category  " + category + '\'' + ", promotionalPrice " + promotionalPrice + '\'' + '}';
        return str;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPromotionalPrice() {
        super.setPrice(promotionalPrice);
        return super.getPrice();
    }

    public void setPromotionalPrice(double promotionalPrice) {
        this.promotionalPrice = promotionalPrice;
    }

    @Override
    public void setDiscount(double percent) {
        promotionalPrice = getPrice() * (1 - percent);
    }
}
