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
public class TestCircleLong {
    private double radius;
    private double expected;

    @Parameters
    public static Collection<Object[]> powTableValues(){
        return Arrays.asList(new Object[][]{
                { 5, 31.4 },
                { 9, 56.55},
                { 1, 6.28 }
        });
    }

    public TestCircleLong(double radius, double expected){
        this.radius = radius;
        this.expected = expected;
    }

    @Test
    public void powTest001(){
        double actual;

        actual = Circle.decisionLong(radius);

        Assert.assertEquals(expected, actual, 0.05);
    }
}
