package task_6_AccessControl.book1;

import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        int num;
        do {
            System.out.println("To enter a book: 1 or exit: 2");
            num = Integer.parseInt(scanner.nextLine());
            switch (num){
                case 1:
                    while (library.bookArrayList.size()<2) {
                        String title;
                        String author;
                        String ISBN;
                        int pages;
                        String publisher;
                        double price;

                        System.out.print("Enter title:");
                        title = scanner.nextLine();

                        System.out.print("Enter author:");
                        author = scanner.nextLine();

                        System.out.print("Enter ISBN:");
                        ISBN = scanner.nextLine();

                        System.out.print("Enter a pages:");
                        pages = Integer.parseInt(scanner.nextLine());

                        System.out.print("Enter publisher:");
                        publisher = scanner.nextLine();

                        System.out.print("Enter price:");
                        price = Double.parseDouble(scanner.nextLine());

                        Book book = new Book(title, author, ISBN, pages, publisher, price);
                        if (library.isNullOrNegative(book)) {
                            library.addBooks(book);
                        }
                        else {
                            System.out.println("Invalid option! Please try again.");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.printf("Count: %d\n", library.bookArrayList.size());
                    System.out.println();
                    System.out.println(library);
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
                break;

            }
        }while (num!=2);


    }
}

