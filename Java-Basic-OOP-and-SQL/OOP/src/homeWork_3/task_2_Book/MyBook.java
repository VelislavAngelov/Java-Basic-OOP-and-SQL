package homeWork_3.task_2_Book;

public class MyBook extends Book {
    private final String title;
    private final String author;
    private final double price;


    public MyBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void display() {

        System.out.printf("Title: %s, Author: %s, Price: %.2fлв.\n", getTitle(), getAuthor(), getPrice());
    }
}
