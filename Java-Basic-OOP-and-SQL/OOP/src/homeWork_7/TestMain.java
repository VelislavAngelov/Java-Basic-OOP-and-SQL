package homeWork_7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestMain {

    //Рефакторирайте задача “Phone Book” така, че вместо List<String>, класът PhoneBook да съхранява данните в Map.
    //Трябва да изберете коя конкретна имплементация на Map интерфейса да ползвате, според нуждите на конкретната задача
    //Трябва да рефакторирате методите който оперират със списъка от String в който са записани данните в момента.
    // Тези методи трбява вече да оперират с Map-a в която ще са данните след като рефакторирате PhoneBook.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.insert("Ivan-252525");
        phoneBook.insert("Dragan-252526");
        phoneBook.insert("Petranka-252527");

        int option;
        do {
            printMenu();

            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Въведете име:");
                    String name = scanner.nextLine();
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
                        phoneBook.insert(contact);
                        System.out.println("Изберете следваща опция");

                    }
                    break;
                case 2:

                    System.out.println("Въведете телефонен номер:");
                    phoneNumber = scanner.nextLine();
                    phoneBook.deleteByPhoneNumber(Integer.parseInt(phoneNumber));
                    break;
                case 3:
                    System.out.println("Въведете една главна буква.");
                    String str = scanner.nextLine();
                    System.out.printf("Всички записи, които започват с %s са следните: \n", str);
                    phoneBook.checkString(str);
                    System.out.println();
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
