/*10.	Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.
Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции. tg(x)*/

package by.epam.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.exit;

public class Tangent {
    public static List<Double> decisionValues(double a, double b, double h){
        List<Double> result = new ArrayList<>(1);
        if((h > Math.abs(a-b)) || (a>=b)){
            exit(0);
            System.out.println("Данные введены некорректно!");
        }
        System.out.println("+--------------+--------------+");
        System.out.println("|  Аргумент х  |Значение tg(x)|");
        System.out.println("+--------------+--------------+");
        for (double i=a;i<=b;i+=h){
            result.add(Math.tan(i));
            System.out.printf("|%14f|%14f|\n", i, Math.tan(i));
        }
        System.out.println("+--------------+--------------+");
        return result;
    }
}
