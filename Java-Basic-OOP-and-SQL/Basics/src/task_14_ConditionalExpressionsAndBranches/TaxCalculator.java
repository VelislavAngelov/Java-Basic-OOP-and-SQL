package task_14_ConditionalExpressionsAndBranches;

import java.util.Scanner;

public class TaxCalculator {
    //Напишете програма - калкулатор на данъците.
    //
    //В България имаме плосък данък, което означава, че винаги имаме 10% данък независимо от заплатата ни. Но в някои държави данъка зависи от това колко ни е голяма заплатата.
    //
    //Именно такъв калкулатор ще направим!
    //
    //Като за начало, в нашата програма трябва да въведем годишната заплата.
    //
    //След това да изчислим данъка както следва:
    //
    //за първите 20000 няма данък
    //за вторите 20000 има данък от 10%, но само върху парите надвишаващи необлагаемите доходи.
    //за третите 20000 данъкът е както следва: ** 0 за първите 20000 ** 10% за вторите 20000 ** 20% за парите над 40000
    //всички пари над 60000 се таксуват с 30%

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double tax = 0d,salary;

         salary =Double.parseDouble(scanner.nextLine());

         if(salary <= 40000 ){

            tax = 0.1 * (salary-20000);
         }
         else  if (salary <= 60000) {

            tax = (0.2 * (salary - 40000)) + (0.1 * 20000);
         }
         else{

            tax = (0.3 * (salary - 60000)) + (0.2 * 20000) + (0.1 * 20000);
         }
        System.out.printf("%.2f%n",tax);
    }
}
