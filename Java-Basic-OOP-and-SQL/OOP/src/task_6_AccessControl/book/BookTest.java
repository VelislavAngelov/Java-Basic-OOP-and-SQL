package task_6_AccessControl.book;

public class BookTest {

    public static void main(String[] args) {

        Book book =new Book();
        Book.printAttributes(book);
        System.out.println();
        book.setTitle("Pod igoto");
        book.setAuthor("Ivan Vazov");
        book.setISBN("455554-5-45--555");
        book.setPages(1111);
        book.setPublisher("Izdatel");
        book.setPrice(29.99);
        Book.printAttributes(book);
    }
}
