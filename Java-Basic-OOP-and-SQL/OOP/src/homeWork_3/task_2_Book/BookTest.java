package homeWork_3.task_2_Book;

import java.util.ArrayList;
import java.util.List;

public class BookTest {

    //Създайте клас Book който има абстрактен метод display()
    //Създайте клас MyBook който: 2.1 Наследява Book 2.2 Има конструктор с параметри title, author, price 2.3 Имплементира display()
    // т. че да той да извежда конзолата следният изход: Title: <title>. Author: <author>. Price: <price>.
    //Създайте клас BookTest който чете книги от конзолата (преценете кога да спре четенето) и след това извежда книгите в конзолата.
    public static void main(String[] args) {

        List<MyBook> myBookList = new ArrayList<>();
        MyBook myBook = new MyBook("Под игото", "Иван Вазов", 29.99);
        MyBook myBook1 = new MyBook("Войната на буквите", "Людмила Филипова", 19.99);
        MyBook myBook2 = new MyBook("Лесни за убиване", "Лий Чайлд", 7.00);
        myBookList.add(myBook);
        myBookList.add(myBook1);
        myBookList.add(myBook2);

        for (Book book : myBookList) {
            book.display();
        }
    }
}
