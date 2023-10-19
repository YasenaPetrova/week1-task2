/*EMI
Приравнена месечна вноска e фиксирана сума за плащане, направена от кредитополучател на кредитор на определена дата всеки календарен месец. Приравнени месечни вноски се използват за изплащане на лихви и главници всеки месец, така че за определен брой години заемът се изплаща изцяло заедно с лихвите.
Годишната вноска се изчислява по формулата:
Където:

P е заетата сума
r е годишната лихва
n е броят на вноските
За да изчислите месечната вноска, трябва да разделите ‘r’ на 12.

Купил съм си апартамент, за който съм заел от банка 10 000 000 евро при годишна лихва 10.5% и смятам да го изплатя за 10 години.

Колко ще е моята месечна вноска?

ИЗПОЛЗВАЙТЕ BigDecimal!

Отпечатайте така: System.out.println(A.setScale(10, RoundingMode.HALF_UP));

Когато използвате метода divide на BigDecimal, го извикайте по следния начин:

import java.math.BigDecimal;

import java.math.RoundingMode;

.....

myDecimal.divide(anotherBigDecimal, RoundingMode.HALF_UP)

 */
package UNLOCKJAVA.week1.homework2;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class EMI {
    public static void main(String[] args) {
        BigDecimal P = new BigDecimal("10000000"); // Заетата сума
        BigDecimal r = new BigDecimal("0.105");//Лихва
        int n = 10;//Години за плащане
        int nMonths = n * 12;//Месеците за който трябва да плаща


        BigDecimal monthlyPayment = P.multiply(r)
                .divide(BigDecimal.ONE.subtract(BigDecimal.ONE.divide(r.add(BigDecimal.ONE).pow(nMonths),
                        10, RoundingMode.HALF_UP)), 10, RoundingMode.HALF_UP);    //P*r/ (1 - Math.pow(r+1, -nMonths));
        System.out.println(monthlyPayment.setScale(10, RoundingMode.HALF_UP));
    }
}
