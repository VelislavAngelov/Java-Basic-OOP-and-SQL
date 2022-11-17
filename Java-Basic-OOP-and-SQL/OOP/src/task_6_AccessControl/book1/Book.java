package task_6_AccessControl.book1;

public class Book {

    private String Title;
    private String Author;
    private String ISBN;
    private int Pages;
    private String Publisher;
    private double Price;



    public Book(String title, String author, String ISBN, int pages, String publisher, double price) {
        Title = title;
        Author = author;
        this.ISBN = ISBN;
        Pages=pages;
        Publisher = publisher;
        Price = price;
    }
    public Book() {

    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        if (isNullOrEmpty(title)) {

            Title = title;
        }
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {

        if (!isNullOrEmpty(author)) {

            Author = author;
        }
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {

        if (isNullOrEmpty(ISBN)) {
            this.ISBN = ISBN;
        }

    }

    public int getPages() {
        return Pages;
    }

    public void setPages(int pages) {
        if (pages > 0 && pages <= 2000) {
            Pages = pages;
        }
        else {
            Pages=0;
        }

    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {

        if (isNullOrEmpty(publisher)) {
            Publisher = publisher;
        }

    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            Price = price;
        }
        else {
            Price=0;
        }

    }

    public static void printAttributes(Book book) {

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getISBN());
        System.out.println("Pages: " + book.getPages());
        System.out.println("Publisher: " + book.getPublisher());
        System.out.println("Price: " + book.getPrice() + " lv.");
    }

    @Override
    public String toString() {
        return "Title: " + Title + '\n' +
                "Author: " + Author + '\n' +
                "ISBN: " + ISBN + '\n' +
                "Pages: " + Pages + '\n' +
                "Publisher: " + Publisher + '\n' +
                "Price: " + Price + " lv."
                ;
    }

    public static boolean isNullOrEmpty(String string) {

        return string != null && !string.trim().isEmpty();
    }
}
