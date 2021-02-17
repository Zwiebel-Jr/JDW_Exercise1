/*9.	Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.*/

package by.epam.exercise;

public class Circle {
    public static double decisionSquare(double radius){
        return Math.PI*Math.pow(radius,2);
    }

    public static double decisionLong(double radius){
        return 2*Math.PI*radius;
    }
}
