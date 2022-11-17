package task_14_ConditionalExpressionsAndBranches;

import java.util.Scanner;

public class Insurance {

    //Направете програма, която изчислява осигуровките.
    //
    //За целта потребителя трябва да въведе следните данни:
    //
    //1.месечна заплата
    //2.години
    //Има 2 такси, които се плащат едната от служителя, а другата - от неговият работодател.
    //
    //Законът изисква:
    //
    //Ако заплатата е под 3000лв
    //Ако служителя е на 55 години или по-малко, тогава таксите са: 20%(за работника) + 17%(за работодателя)
    //Ако служителя е над 55 години до 60 (включително) - 13% + 13%
    //Ако служителя е над 60 години до 65 (включително) - 7.5% + 9%
    //Ако служителя е над 65 - 5% + 7.5%
    //Ако заплатата е над 3000лв, таксите са 20% + 20%, но само върху сумата от 3000лв.
    //Отпечатайте:
    //
    //1.първо колко е таксата за служителя
    //2.колко е таксата за работодателя

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salary = Double.parseDouble(scanner.nextLine());
        int age = Integer.parseInt(scanner.nextLine());

        double taxEmployee = 0.0;
        double taxEmployer = 0.0;

        if(salary < 3000){

            if(age <= 55){

                taxEmployee = salary * 0.20;
                taxEmployer = salary * 0.17;
            }
            else  if (age <= 60) {

                taxEmployee = salary * 0.13;
                taxEmployer = salary * 0.13;
            }
            else  if (age <= 65){
                taxEmployee = salary * 0.075;
                taxEmployer = salary * 0.09;
            }
            else {
                taxEmployee = salary * 0.05;
                taxEmployer = salary * 0.075;
            }
        }else {

            taxEmployee = 3000 * 0.20;
            taxEmployer = 3000 * 0.20;
        }
        System.out.printf("%.2f%n",taxEmployee);
        System.out.printf("%.2f%n",taxEmployer);
    }
}
