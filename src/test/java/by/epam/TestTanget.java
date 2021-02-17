package by.epam;

import by.epam.exercise.Tangent;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(value = Parameterized.class)
public class TestTanget {

    private double a, b, h;
    private List<Double> expected;

@Parameters
public static Collection<Object[]>powTableValues(){
    return Arrays.asList(new Object[][]{
            {3, 4, 0.3, Arrays.asList(-0.1425465430742778,0.15974574766003222,0.49346672998490326,0.9474246499358918)},

    });
}

public TestTanget(double a, double b, double h, List<Double> expected){
    this.a = a;
    this.b = b;
    this.h = h;
    this.expected = expected;
}

    @Test
    public void powTest001(){
        List<Double> actual;

        actual = Tangent.decisionValues(a,b,h);

        Assert.assertEquals(actual, expected);
    }
}
