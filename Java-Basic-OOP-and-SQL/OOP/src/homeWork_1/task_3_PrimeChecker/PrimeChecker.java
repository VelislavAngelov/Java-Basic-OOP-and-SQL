package homeWork_1.task_3_PrimeChecker;

public class PrimeChecker {


    public boolean checkPrime(int num) {

        return (num == 2 || num % 2 != 0) && num > 0;
    }


}
