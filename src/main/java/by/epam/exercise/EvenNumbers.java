/*4.	Составить программу, печатающую значение true, если указанное высказывание является истинным,
 и false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.*/

package by.epam.exercise;

public class EvenNumbers {
    public static boolean decisionEven(int[] numbers){
        int counter = 0;
        for(int i = 0;i<4;i++){
            if(numbers[i] % 2 == 0){
                counter++;
            }
        }
            //System.out.println(counter > 1);
        return counter>1;
    }
}
