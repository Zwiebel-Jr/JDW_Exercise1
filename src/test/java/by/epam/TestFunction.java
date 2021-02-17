package by.epam;

import by.epam.exercise.Function;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class TestFunction {
    private double x;
    private double expected;

    @Parameters
    public static Collection<Object[]> powTableValues(){
        return Arrays.asList(new Object[][]{
                { 4, 5 },
                { 1, -0.2},
                { 6, -9 }
        });
    }

    public TestFunction(double x, double expected){
        this.x = x;
        this.expected = expected;
    }

    @Test
    public void powTest001(){
        double actual;

        actual = Function.decisionValueFunction(x);

        Assert.assertEquals(expected, actual, 0.05);
    }
}