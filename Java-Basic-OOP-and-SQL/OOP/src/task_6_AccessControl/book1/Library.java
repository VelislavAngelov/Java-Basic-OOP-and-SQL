package task_6_AccessControl.book1;

import java.util.ArrayList;

public class Library {



    ArrayList<Book> bookArrayList =new ArrayList<>(5);

    public Library() {
    }

    public void addBooks(Book book) {
        bookArrayList.add(book);
    }

    public boolean isNullOrNegative(Book book){

        if(isNullOrEmpty(book.getTitle())){

            return false;
        }
        if(isNullOrEmpty(book.getAuthor())){
            return false;
        }
        if(isNullOrEmpty(book.getISBN())){
            return false;
        }
        if(isNullOrEmpty(book.getPublisher())){
            return false;
        }
        if(book.getPages()<=0||book.getPrice()<=0){
            return false;
        }

        return true;
    }
    public static boolean isNullOrEmpty(String string) {

        return string == null || string.trim().isEmpty();
    }

    @Override
    public String toString() {

        StringBuilder sb= new StringBuilder();
        for (Book book:bookArrayList){

            sb.append(book);
            sb.append(String.format("%10s%n%n"," "));

        }

        return "Books: \n"+sb;
    }
}
