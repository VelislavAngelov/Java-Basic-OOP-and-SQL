package task_6_AccessControl.circle;

import java.util.Scanner;

public class CircleTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Circle circle =new Circle();

        System.out.println("Въведете дължина на радиус или 0 за радиус по подразбиране [1.0]:");
        double radius =Double.parseDouble(scanner.nextLine());
        circle.setRadius(radius);

        System.out.println("Изберете цвят (1 за жълт, 2 за червен, 3 за зелен, 4 за син)]:");
        int color = Integer.parseInt(scanner.nextLine());
        circle.setColor(Color.values()[color-1]);

        System.out.printf("Създаден е червен кръг с радиус %.2f, и диаметър %.2f\n",circle.getRadius(),circle.getRadius()*2);

        int option;
        do {
            printMenu();

            option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    System.out.println(circle.getPerimeter());
                    break;
                case 2:
                    System.out.println(circle.getArea());
                    break;
                case 3:
                    if(circle.getColor()==Color.жълт){
                        System.out.println("Кръгът е луна");
                    }
                    else {
                        System.out.println("Кръгът не е луна");
                    }
                    break;
                case 4:
                    circle.makeMeMoon();
                    break;
                case 5:
                    System.out.println(circle);
                    break;
                case 6:
                    System.out.println("Exiting!");
                    break;

                default :
                    System.out.println("Invalid option! Please try again.");
                    break;

            }
        }while (option!=6);
    }
    private static void printMenu() {

        System.out.println("1. Периметър:");
        System.out.println("2. Лице:");
        System.out.println("3. Луна ли е?:");
        System.out.println("4. Направи кръга луна:");
        System.out.println("5. Принтирай:");
        System.out.println("6. Изход:");
        System.out.print("Please choose an option: ");
    }
}
