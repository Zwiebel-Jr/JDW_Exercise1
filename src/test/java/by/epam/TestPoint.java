package by.epam;

import by.epam.exercise.Point;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class TestPoint {

    private double x1, y1, x2, y2;
    private String expected;

    @Parameters
    public static Collection<Object[]> powTableValues(){
        return Arrays.asList(new Object[][]{
            { 2, 2, 3, 4, "Точка A ближе чем точка B"},
            { 3, 3, 2, 2, "Точка A дальше чем точка B"},
                { 2, 2, 2, 2, "Точки находятся на одинаковом расстоянии от начала координат"}
        });
    }

    public TestPoint(double x1,double y1,double x2,double y2, String expected){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.expected = expected;
    }

    @Test
    public void powTest001(){
        String actual;

        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);

        actual = a.comparison(b);

        Assert.assertEquals(actual, expected);
    }
}
