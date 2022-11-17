package homeWork_5.PhoneBook;

import java.util.Scanner;

public class TestMain {

    //PhoneBook Валидирайте, че дължината на името е максимум 26 символа.
    // Валидирайте и телефонния номер - може да потърсите в интернет регулярен израз.
    // Ако горните данни са невалидни нека се получава IllegalArgumentException.
    //
    //При добавянето на запис - ако имате повече от 100 записа тогава да се получава
    // PhoneBookFullExcepition (трябва да създадете класът PhoneBookFullExcepition,
    // помислете да е checked или unchecked exception).
    //При триенето на запис да се връща EntryNotFoundException (трябва да създадете класът EntryNotFoundException,
    // помислете да е checked или unchecked exception).
    //При покажи всички записи които започват с низ - ако няма записи които започват с даден низ да се получава
    // EntryNotFoundException (трябва да създадете класът EntryNotFoundException, помислете да е checked или unchecked exception)

    public static void main(String[] args) throws EntryNotFoundException, PhoneBookFullExcepition {

        Scanner scanner = new Scanner(System.in);
        // Map<String, Integer> map = new HashMap<>();

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.insert("Ivan-252525");
        phoneBook.insert("Dragan-252526");
        phoneBook.insert("Petranka-252527");

        String name;
        int option;
        do {
            printMenu();

            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Въведете име:");
                    name = scanner.nextLine();
                    if (name.length() > 26) {
                        throw new IllegalArgumentException("Името е прекалено дълго!");
                    }
                    System.out.println("Въведете телефонен номер:");
                    String phoneNumber = scanner.nextLine();
                    String contact = name + "-" + phoneNumber;
                    if (phoneBook.checkNumber(phoneNumber)) {

                        System.out.println("Запис за този номер съществува вече");
                        System.out.println(" Изберете 1, за да бъде презаписан или 0, за да се върнете към началното меню.");
                        int num = Integer.parseInt(scanner.nextLine());
                        switch (num) {
                            case 1:
                                phoneBook.insert(contact);
                                break;
                            case 0:
                                continue;
                            default:
                                System.out.println("Invalid option! Please try again.");
                                break;
                        }
                    } else {
                        System.out.println("Записът се въвежда…");
                        if (phoneBook.getData().size() < 100) {
                            phoneBook.insert(contact);
                        } else {
                            throw new PhoneBookFullExcepition();
                        }

                        System.out.println("Изберете следваща опция");

                    }
                    break;
                case 2:

                    System.out.println("Въведете телефонен номер:");
                    phoneNumber = scanner.nextLine();
                    boolean alreadyExist = phoneBook.checkNumber(phoneNumber);
                    if (alreadyExist) {
                        phoneBook.deleteByPhoneNumber(Integer.parseInt(phoneNumber));
                        System.out.println("Записът беше успешно изтрит.");
                    } else {
                        throw new EntryNotFoundException();
                    }

                    break;
                case 3:
                    System.out.println("Въведете една главна буква.");
                    String str = scanner.nextLine();
                    System.out.printf("Всички записи, които започват с %s са следните: \n", str);
                    boolean isCheck=phoneBook.isCheckString(str);
                    if(isCheck){
                        phoneBook.checkString(str);
                        System.out.println();
                    }else {
                        throw new EntryNotFoundException();
                    }

                    break;
                case 4:

                    System.out.println(phoneBook);
                    break;
                case 5:
                    System.out.println("Exiting!");
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
                    break;

            }
        } while (option != 5);
    }
    private static void printMenu() {

        System.out.println("1. Добави нов запис");
        System.out.println("2. Изтрий запис по номер");
        System.out.println("3. Покажи всички записи които започват с низ");
        System.out.println("4. Принтирай toString");
        System.out.println("5. Изход");
        System.out.print("Please choose an option: ");
    }
}
