package task_14_ConditionalExpressionsAndBranches;

import java.util.Scanner;

public class MetricConverter {

    //Нека напишем програма, която конвертира между 8 метрични единици: m, mm, cm, mi, in, km, ft, yd.
    //
    //Ето таблицата за конвертиране на 1 meter (m):
    //
    //1000 millimeters (mm)
    //100 centimeters (cm)
    //0.000621371192 miles (mi)
    //39.3700787 inches (in)
    //0.001 kilometers (km)
    //3.2808399 feet (ft)
    //1.0936133 yards (yd)
    //Програмата трябва да очаква от потребителя да въведе следните данни:
    //
    //дължината, която трябва да се конвертира
    //нейната метрична единица
    //към коя метрична единица да се конвертира

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double length = Double.parseDouble(scanner.nextLine());
        String metricUnit = scanner.next();
        String metricUnitToConvert = scanner.next();

        switch (metricUnit) {

            case "mm":
                length = length / 1000;
                ;
                break;
            case "cm":
                length = length / 100;
                break;
            case "mi":
                length = length / 0.000621371192;

                break;
            case "in":
                length = length / 39.3700787;
                ;
                break;
            case "km":
                length = length / 0.001;
                break;
            case "ft":
                length = length / 3.2808399;
                break;
            case "yd":
                length = length / 1.0936133;
                break;
            default:
                System.out.println("Invalid metric");

        }
        switch (metricUnitToConvert) {

            case "mm":
                length = length * 1000;
                ;
                break;
            case "cm":
                length = length * 100;
                break;
            case "mi":
                length = length * 0.000621371192;

                break;
            case "in":
                length = length * 39.3700787;
                ;
                break;
            case "km":
                length = length * 0.001;
                break;
            case "ft":
                length = length * 3.2808399;
                break;
            default:
                System.out.println("Invalid metric");

        }
        System.out.printf("%.5f%n",length);
    }
}

