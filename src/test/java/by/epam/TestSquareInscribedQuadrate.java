package by.epam;

import java.util.Arrays;
import java.util.Collection;

import by.epam.exercise.SquareInscribedQuadrate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value = Parameterized.class)
public class TestSquareInscribedQuadrate {

    private double squareDescribed;
    private double expected;

    @Parameters
    public static Collection<Object[]> powTableValues(){
        return Arrays.asList(new Object[][]{
                { 4.5,  2.25},
                { 8, 4 },
                { 4, 2 }
        });
    }

    public TestSquareInscribedQuadrate(double squareDescribed, double expected){
        this.squareDescribed = squareDescribed;
        this.expected = expected;
    }

    @Test
    public void powTest001(){
        double actual;

        actual = SquareInscribedQuadrate.decisionInscribedQuadrate(squareDescribed);

        Assert.assertEquals(expected, actual,0.05);
    }
}
