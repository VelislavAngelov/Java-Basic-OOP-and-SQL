package lectureTask_05_06_2022;

import java.util.Scanner;

public class DistanceBetweenTwoCity {
    // 2.Ако се въведе разстоянието между две населени места и скоростта на два автомобила изчислете след колко
    // време(часове и минути) ще се срещнат, ако тръгнат по едно и също време един към друг.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double distance = Double.parseDouble(scanner.nextLine());
        double firstCar = Double.parseDouble(scanner.nextLine());
        double secondCar = Double.parseDouble(scanner.nextLine());
        double times = distance / (firstCar + secondCar) * 60;
        double time = Math.floor(times / 60);
        double minutes = times % 60;

        System.out.printf("Time is %.0f:%.0fh", time, minutes);


    }
}
