/*3.	Окружность вписана в квадрат заданной площади.
Найти площадь квадрата, вписанного в эту окружность.
Во сколько раз площадь вписанного квадрата меньше площади заданного?
Sв=D^2/2 -> Sв=So/2 -> Площадь вписанного меньше плащади заданного в 2 раза*/

package by.epam.exercise;

public class SquareInscribedQuadrate {
    public static double decisionInscribedQuadrate(double squareDescribed){
        double squareInscribed = squareDescribed/2;
        return squareInscribed;
      //  System.out.println("Площадь вписанного квадрата в " + squareDescribed/squareInscribed +" раза меньше описанного");
    }
}
