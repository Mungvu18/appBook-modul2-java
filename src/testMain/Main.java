package testMain;

import book.Book;
import fictionBook.FictionBook;
import programmingBook.ProgrammingBook;

import java.util.*;

public class Main {
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int ZERO = 0;
    public static final String TEST_LANGUAGE = "java";
    static ArrayList<ProgrammingBook> programmingBookArrayList = new ArrayList<>();
    static ArrayList<FictionBook> fictionBookArrayList = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            menuShow();
            System.out.println("Choose: ");
            choose = sc.nextInt();
            switch (choose) {
                case ONE:
                    int amountFicB = 0;
                    int amountProB = 0;
                    addProgamBook(amountProB);
                    addFictionBook(amountFicB);
                case TWO:
                    displayBooks();
                    break;
                case THREE:
                    double totalPrice = 0;
                    for (int i = 0; i < books.size(); i++) {
                        totalPrice += books.get(i).getPrice();
                    }
                    System.out.println("Sum Price of " + books.size() + " book is: " + totalPrice);
                    break;
                case FOUR:
                    double percent;
                    do {
                        double sum = 0;
                        System.err.println("Enter percent ");
                        percent = sc.nextDouble();
                        for (Book book : books) {
                            if (book instanceof FictionBook) {
                                FictionBook fictionBook = (FictionBook) book;
                                fictionBook.setDiscount(percent);
                                sum += fictionBook.getPromotionalPrice();
                            }
                        }
                        System.out.println("SumPrice of books have promotionPrice is " + sum);
                    } while (percent == ZERO);
                    break;
                case FIVE:
                    int count = 0;
                    for (Book book: books) {
                        if(book instanceof ProgrammingBook){
                            ProgrammingBook programmingBook = (ProgrammingBook) book;
                            if(programmingBook.getLanguage().equals(TEST_LANGUAGE)){
                                count++;
                            }
                        }
                    }
                    System.out.println("Amount book have langguage is java is " + count);
                case ZERO:
                    System.exit(ZERO);
                    break;
            }
        } while (choose != ZERO);
    }

    private static void displayBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }

    private static void addFictionBook(int amountFicB) {
        System.out.println("Enter amount of FictionBook need add");
        amountFicB = sc.nextInt();
        for (int i = 0; i < amountFicB; i++) {
            Book book = new FictionBook();
            book.inputInfo();
            books.add(book);
        }
    }

    private static void addProgamBook(int amountProB) {
        System.out.println("Enter amount of ProgrammingBook need add");
        amountProB = sc.nextInt();
        for (int i = 0; i < amountProB; i++) {
            Book book = new ProgrammingBook();
            book.inputInfo();
            books.add(book);
        }
    }

    static void menuShow() {
        System.out.println("Menu: ");
        System.out.println("1. Add information of books ");
        System.out.println("2.Display information of books ");
        System.out.println("3.Display price of books ");
        System.out.println("4.Display sum promotionalPrice of books ");
        System.out.println("5.Count book of language is java ");
        System.out.println("0. Exit program ");
    }
}
