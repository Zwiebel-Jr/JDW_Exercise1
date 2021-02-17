package by.epam;


import by.epam.exercise.Seconds;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class TestSeconds {
    private int seconds;
    private String expected;

    @Parameters
    public static Collection<Object[]> powTableValues(){
        return Arrays.asList(new Object[][]{
                { 6, "0:0:6" },
                { 68, "0:1:8"},
                { 3601, "1:0:1" },
                { 86500, "Время выходит за пределы суток"},
                { 18423, "5:7:3"}
        });
    }

    public TestSeconds(int seconds, String expected){
        this.seconds = seconds;
        this.expected = expected;
    }

    @Test
    public void powTest001(){
        String actual;

        actual = Seconds.decisionTime(seconds);

        Assert.assertEquals(expected, actual);
    }
}
