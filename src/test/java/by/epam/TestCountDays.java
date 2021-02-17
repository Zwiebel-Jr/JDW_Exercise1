package by.epam;


import by.epam.exercise.CountDays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class TestCountDays {

    private int year;
    private int month;
    private long expected;

    @Parameters
    public static Collection<Object[]> powTableValues(){
        return Arrays.asList(new Object[][]{
                { 2021, 2, 28 },
                { 2024, 2, 29 },
                { 2021, 4, 30 },
                { 2021, 3, 31 }
        });
    }

    public TestCountDays(int year, int month, long expected){
        this.year = year;
        this.month = month;
        this.expected = expected;
    }

    @Test
    public void powTest001(){
        long actual;

        actual = CountDays.decisionDays(year, month);

        Assert.assertEquals(expected, actual);
    }
}
