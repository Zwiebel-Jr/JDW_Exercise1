package by.epam;

import by.epam.exercise.Circle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class TestCircleSquare {
    private double radius;
    private double expected;

    @Parameters
    public static Collection<Object[]> powTableValues(){
        return Arrays.asList(new Object[][]{
                { 5, 78.54 },
                { 9, 254.47},
                { 1, 3.14 }
        });
    }

    public TestCircleSquare(double radius, double expected){
        this.radius = radius;
        this.expected = expected;
    }

    @Test
    public void powTest001(){
        double actual;

        actual = Circle.decisionSquare(radius);

        Assert.assertEquals(expected, actual, 0.05);
    }
}
