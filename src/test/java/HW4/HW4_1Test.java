package HW4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HW4_1Test {
    String s = "Перестановочный алгоритм быстрого действия";
    String s1 = "Перевыборы выбранного президента";
    String s2 = "Посмотрите как Рите нравится ритм";
    String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};


    @Test
    public void testCountE1() {
        int expected = 4;
        int actual = HW4_1.countE1(s1);
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void testDoNotCountE() {
        int expected = 4;
        int actual = HW4_1.doNotCountE(array);
        Assert.assertEquals(actual, expected);

    }

/**
    @Test
    public void testPrinto1() {
        String expected = "оооо";
        String actual = HW4_1.printO1(s, 'о');
        Assert.assertEquals(actual, expected);
    }
    */

}