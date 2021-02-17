/*	Составить программу, которая по заданным году и номеру месяца определяет
количество дней в этом месяце и корректно определялись все високосные года. 1 31 5 7 8 10 12\ 4 6 9 11 \2*/

package by.epam.exercise;

public class CountDays {
    public static int decisionDays(int year,int month){
        if(year % 4 == 0){
            if((year>1582) && (year%100 == 0)){
                if((year % 400 == 0) && (month==2)){
                    return 29;
                }else if(month == 2){
                    return 28;
                }
            }
            if(month == 2){
                return 29;
            }
        }else if(month == 2){
                return 28;
            }
        if(month == 4 || month == 6 || month == 9 || month == 11){
            return 30;
        }else{
            return 31;
        }
    }
}
