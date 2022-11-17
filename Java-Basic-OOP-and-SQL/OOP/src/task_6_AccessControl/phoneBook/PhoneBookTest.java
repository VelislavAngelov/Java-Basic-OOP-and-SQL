package task_6_AccessControl.phoneBook;

import java.util.Scanner;

public class PhoneBookTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PhoneBook data =new PhoneBook();
        data.setContact("Ivan-2525252");
        data.setContact("Dragan-2525254");
        data.setContact("Petko-2525253");

        int option;
        do {
            printMenu();

            option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    System.out.println("Въведете име:");
                    String name=scanner.nextLine();
                    System.out.println("Въведете телефонен номер:");
                    String phoneNumber=scanner.nextLine();
                    String contact=name+"-"+phoneNumber;
                    if(data.checkNumber(phoneNumber)){

                        System.out.println("Запис за този номер съществува вече");
                        System.out.println(" Изберете 1, за да бъде презаписан или 0, за да се върнете към началното меню.");
                        int num=Integer.parseInt(scanner.nextLine());
                        switch (num){
                            case 1:
                                data.insert(contact);
                                break;
                            case 0:
                                continue;
                            default:
                                System.out.println("Invalid option! Please try again.");
                                break;
                        }
                    }else {
                        System.out.println("Записът се въвежда…");
                        data.setContact(contact);
                        System.out.println("Изберете следваща опция");

                    }
                    break;
                case 2:

                    System.out.println("Въведете телефонен номер:");
                     phoneNumber=scanner.nextLine();
                    if(data.checkNumber(phoneNumber)){

                        data.deleteByPhoneNumber(phoneNumber);
                        System.out.println("Записът беше успешно изтрит.");
                    }
                    else {
                        System.out.println("Запис за този номер не беше намерен.");
                    }
                    break;
                case 3:
                    System.out.println("Въведете една главна буква.");
                     String str=scanner.nextLine();
                    System.out.printf("Всички записи, които започват с %s са следните: \n",str);
                    data.checkString(str);
                    System.out.println();
                    break;
                case 4:

                    System.out.println(data);
                    break;
                case 5:
                    System.out.println("Exiting!");
                    break;

                default :
                    System.out.println("Invalid option! Please try again.");
                    break;

            }
        }while (option!=5);

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
