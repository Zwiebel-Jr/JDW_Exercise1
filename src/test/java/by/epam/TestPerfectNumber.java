package by.epam;

import by.epam.exercise.PerfectNumber;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class TestPerfectNumber {
    private int number;
    private boolean expected;

    @Parameters
    public static Collection<Object[]> powTableValues(){
        return Arrays.asList(new Object[][]{
                { 6, true },
                { 9, false},
                { 28, true }
        });
    }

    public TestPerfectNumber(int number, boolean expected){
        this.number = number;
        this.expected = expected;
    }

    @Test
    public void powTest001(){
        boolean actual;

        actual = PerfectNumber.decisionPerfectNumber(number);

        Assert.assertEquals(expected, actual);
    }
}