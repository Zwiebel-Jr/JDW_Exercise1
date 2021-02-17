/*6.	Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому моменту*/

package by.epam.exercise;

public class Seconds {
    public static String decisionTime(int fullSeconds){
        if(fullSeconds>86400){
            return "Время выходит за пределы суток";
        }
        int hours,minutes,seconds;
        hours = fullSeconds/3600;
        minutes = (fullSeconds-hours*3600)/60;
        seconds = fullSeconds-minutes*60-hours*3600;
       // System.out.printf("Прошло %d:%d:%d времени к данному моменту", hours,minutes,seconds);
        return hours + ":" + minutes + ":" + seconds;
    }
}
