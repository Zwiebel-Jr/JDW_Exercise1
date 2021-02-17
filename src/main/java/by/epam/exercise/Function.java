/*8.	Вычислить значение функции: */

package by.epam.exercise;

public class Function {
    public static double decisionValueFunction(double x){
        double result;
        if(x >= 3){
            result = -Math.pow(x,2)+3*x+9;
            return result;
        }else{
            result = 1/(Math.pow(x,3)-6);
            return result;
        }
    }
}
