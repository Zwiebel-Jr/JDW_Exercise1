package by.epam;

import by.epam.exercise.LastDigit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class TestLastDigit {

    private int number;
    private long expected;

    @Parameters
    public static Collection<Object[]> powTableValues(){
        return Arrays.asList(new Object[][]{
                { 101, 1 },
                { 452, 4 },
                { 233, 9 },
                { 14, 6 },
                { 175, 5 },
                { 736, 6 },
                { 47, 9 },
                { 348, 4 },
                { 979, 1 }
        });
    }

    public TestLastDigit(int number, long expected){
        this.number = number;
        this.expected = expected;
    }

    @Test
    public void powTest001(){
        long actual;

        actual = LastDigit.decisionDigit(number);

        Assert.assertEquals(expected, actual);
    }
}
