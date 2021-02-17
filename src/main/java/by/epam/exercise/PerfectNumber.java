/*5.	Составить программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
является ли целое число совершенным (сумма делителей равна самому числу).*/

package by.epam.exercise;

public class PerfectNumber {
    public static boolean decisionPerfectNumber(int number){
        int summ = 0;
        for(int i = 1;i <= number / 2;i++){
            if(number % i == 0){
                summ+=i;
            }
        }
        return summ==number;
    }
}
