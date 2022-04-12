package HW4;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Hw4Test {
    int[] array = null;
    int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};


   /** @Test
    public void testTotal() {
        int actual = Hw4.total(array);
        Assert.assertEquals(actual, null);
    }
    */

    @Test
    public void testMaxValue() {
        int expected = 12;
        int actual = Hw4.maxValue(array);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testMinValue() {
        int expected = 2;
        int actual = Hw4.minValue(array);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testAverageValue() {
        int expected = 6;
        int actual = Hw4.averageValue(array);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testTotalDouble() {
        int expected = 24;
        int actual = Hw4.totalDouble(array2);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testMaxValueDouble() {
        int expected = 9;
        int actual = Hw4.maxValueDouble(array2);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testNumberCountDouble() {
        int expected = 15;
        int actual = Hw4.numberCountDouble(array2);
        Assert.assertEquals(actual,expected);
    }
}