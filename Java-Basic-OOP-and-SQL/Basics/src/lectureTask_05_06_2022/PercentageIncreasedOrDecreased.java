package lectureTask_05_06_2022;

import java.util.Scanner;

public class PercentageIncreasedOrDecreased {

    //1.Ако получите стара и нова цена на продукт от потребителя на програмата
    // пресметнете с колко процента е била увеличена или намалена стоката.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double firstPrice = Double.parseDouble(scanner.nextLine());
        Double secondPrice = Double.parseDouble(scanner.nextLine());
        double percentage = 0.0;

        if (firstPrice > secondPrice) {

            percentage = (firstPrice - secondPrice) / firstPrice;
            System.out.printf("Рrice reduction %.2f %%", percentage * 100);
        } else if (secondPrice > firstPrice) {

            percentage = (firstPrice - secondPrice) / firstPrice;
            System.out.printf("Price increase %.2f %%", Math.abs(percentage * 100));
        } else {
            System.out.println("No change in price!!");
        }

    }

}
