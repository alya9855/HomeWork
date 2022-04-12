package HW5;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class OperationsTest {

    @DataProvider
    public Object[][] getAdditional() {
        return new Object[][] {
                {1.0, 8.0, 9.0, "Correct"},
                {null, 8.0, 4.0, "Incorrect"},
                {5.0, null, 4.0, "Incorrect"},
                {-5.0, 8.0, 3.0, "Correct"},
        };
    }

    @Test(dataProvider = "getAdditional")
    public void testAddition(Double a, Double b, Double expected, String answer) {
        Double actual = Operations.addition(a,b);
        Assert.assertEquals(actual, expected);
        System.out.println(answer);
    }

    @DataProvider
    public Object[][] getSubtraction() {
        return new Object[][] {
                {10.0, 8.0, 2.0, "Correct"},
                {null, 8.0, 4.0, "Incorrect"},
                {5.0, null, 4.0, "Incorrect"},
                {-5.0, 8.0, 13.0, "Correct"},
        };
    }

    @Test(dataProvider = "getSubtraction")
    public void testSubtraction(Double a, Double b, Double expected, String answer) {
        Double actual = Operations.subtraction(a,b);
        Assert.assertEquals(actual, expected);
        System.out.println(answer);
    }

    @DataProvider
    public Object[][] getMultiplication() {
        return new Object[][] {
                {1.0, 8.0, 8.0, "Correct"},
                {null, 8.0, 4.0, "Incorrect"},
                {5.0, null, 4.0, "Incorrect"},
                {-5.0, 0.0, 0.0, "Correct"},
        };
    }

    @Test(dataProvider = "getMultiplication")
    public void testMultiplication(Double a, Double b, Double expected, String answer) {
        Double actual = Operations.multiplication(a,b);
        Assert.assertEquals(actual, expected);
        System.out.println(answer);
    }

    @DataProvider
    public Object[][] getDivision() {
        return new Object[][] {
                {16.0, 8.0, 2.0, "Correct"},
                {null, 8.0, 4.0, "Incorrect"},
                {5.0, null, 4.0, "Incorrect"},
                {-5.0, 0.0, 5.0,"InCorrect"}, // как правильно написать
        };
    }

    @Test(dataProvider = "getDivision")
    public void testDivision(Double a, Double b, Double expected, String answer) {
        Double actual = Operations.division(a,b);
        Assert.assertEquals(actual, expected);
        System.out.println(answer);
    }
}