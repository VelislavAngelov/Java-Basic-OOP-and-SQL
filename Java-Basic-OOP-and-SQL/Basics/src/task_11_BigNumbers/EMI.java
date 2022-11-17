package task_11_BigNumbers;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EMI {
    //Приравнена месечна вноска e фиксирана сума за плащане,
    // направена от кредитополучател на кредитор на определена дата всеки календарен месец.
    // Приравнени месечни вноски се използват за изплащане на лихви и главници всеки месец,
    // така че за определен брой години заемът се изплаща изцяло заедно с лихвите. /източник wikipedia/
    //Годишната вноска се изчислява по формулата:

    public static void main(String[] args) {

        BigDecimal p = new BigDecimal("10000000");
        BigDecimal r =  new BigDecimal("10.5").divide(new BigDecimal(12));
        BigDecimal rPerMonth = r.divide(BigDecimal.valueOf(100));
        int n = 10 * 12;

        BigDecimal firstRom = (rPerMonth.multiply((rPerMonth.add(BigDecimal.valueOf(1))).pow(n)));
        BigDecimal secondRow = (rPerMonth.add(BigDecimal.valueOf(1)).pow(n).subtract(BigDecimal.valueOf(1)));
        BigDecimal result = p.multiply(firstRom.divide(secondRow, RoundingMode.HALF_UP));


        BigDecimal a = result;

        System.out.println(a.setScale(10, RoundingMode.HALF_UP));
    }

}
