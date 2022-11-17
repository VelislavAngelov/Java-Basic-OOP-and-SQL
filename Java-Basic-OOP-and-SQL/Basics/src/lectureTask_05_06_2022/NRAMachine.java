package lectureTask_05_06_2022;

import java.util.Scanner;

//3.Машината, която раздава номера в НАП е блокирала.
// Затова портиерът е натоварен със задачата да раздава поредни номера и да разпределя по равно клиентите
// между три гишета, като ги редува, за да не се преработи някоя от служителките.
// Помогнете на портиера да сметне на кое гише трябва да изпрати първия клиент след обедната почивка,
// както и да пресметне по колко клиента са минали през всяко от гишетата предиобед, като напишете програма,
// в която портиерът да въведе до кой пореден номер е стигнал след обедната почивка.
public class NRAMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeople = Integer.parseInt(scanner.nextLine());

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        String next = "";

        for (int i = 1; i <= numPeople-1; i++) {

            if (counter1 < 1 || counter1 == counter2 && counter1 == counter3) {

                counter1++;
                next = "Counter 2";
            } else if (counter2 < counter1) {
                counter2++;
                next = "Counter 3";
            } else if (counter3 < counter1) {
                counter3++;
                next = "Counter 1";
            }

        }
        System.out.printf(" Counter 1: %o\n ", counter1);
        System.out.printf("Counter 2: %d\n ", counter2);
        System.out.printf("Counter 3: %d\n ", counter3);
        System.out.printf("Next counter: %s", next);


    }
}
