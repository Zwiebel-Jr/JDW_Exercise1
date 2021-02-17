package by.epam;

import by.epam.exercise.EvenNumbers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class TestEvenNumbers {
    private int[] numbers;
    private boolean expected;

    @Parameters
    public static Collection<Object[]> powTableValues(){
        return Arrays.asList(new Object[][]{
                { new int[]{1,2,3,4}, true },
                { new int[]{1,2,3,5}, false},
                { new int[]{2,2,2,4}, true }
        });
    }

    public TestEvenNumbers(int[] numbers, boolean expected){
        this.numbers = numbers;
        this.expected = expected;
    }

    @Test
    public void powTest001(){
        boolean actual;

        actual = EvenNumbers.decisionEven(numbers);

        Assert.assertEquals(expected, actual);
    }
}
