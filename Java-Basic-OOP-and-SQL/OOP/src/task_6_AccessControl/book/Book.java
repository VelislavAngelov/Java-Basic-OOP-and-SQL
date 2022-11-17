package task_6_AccessControl.book;

public class Book {

    private String Title;
    private String Author;
    private String ISBN;
    private int Pages;
    private String Publisher;
    private double Price;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPages() {
        return Pages;
    }

    public void setPages(int pages) {
        Pages = pages;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
    public static void printAttributes(Book book) {

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getISBN());
        System.out.println("Pages: " + book.getPages());
        System.out.println("Publisher: " + book.getPublisher());
        System.out.println("Price: " + book.getPrice() + " lv.");
    }
}
