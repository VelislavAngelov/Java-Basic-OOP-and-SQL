package lectureTask_21_06_2022;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = 5;
        towerOfHanoi(n,'A','C', 'B');
    }
    static void towerOfHanoi(int n, char fromRod, char toRod, char helperRod)
    {
        if (n == 1)
        {
            System.out.println("Take disk 1 from rod " +  fromRod + " to rod " + toRod);
            return;
        }
        towerOfHanoi(n-1, fromRod, helperRod, toRod);
        System.out.println("Take disk " + n + " from rod " +  fromRod + " to rod " + toRod);
        towerOfHanoi(n-1, helperRod, toRod, fromRod);
    }

}
