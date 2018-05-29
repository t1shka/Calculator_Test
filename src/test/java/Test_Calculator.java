import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Calculator {


    @BeforeMethod
    public void before() {

    }

    @Test()
    public void testCalculator() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.div(2, 2), 1);

        Assert.assertFalse(calculator.isNegative(-1));

        Assert.assertFalse(false);

        Assert.assertEquals("2", "2");

        Assert.assertEquals(1, 1);

        Assert.assertTrue(true);

    }
}

