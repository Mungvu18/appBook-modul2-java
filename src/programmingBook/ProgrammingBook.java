package programmingBook;

import book.Book;

import java.util.Scanner;

public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    public ProgrammingBook() {
    }

    public ProgrammingBook(String bookCode, String name, double price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        if (language != null) {
            this.language = language;
        } else System.out.println("Please! You enter again");
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        if (framework != null) {
            this.framework = framework;
        } else System.err.println("Enter framework again");
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter language of book");
        language = sc.nextLine();
        System.out.println("Enter framework");
        framework = sc.nextLine();
        System.out.println("-------------------------");
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += ", language " + language + '\'' + ", framework " + framework + '\'' + '}';
        return str;
    }

}
