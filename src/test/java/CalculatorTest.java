import Practice14_calculator.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void should_get_2_when_1_add_1() throws Exception {
        double result = calculator.calculate("1+1");
        assertThat(result, is(2.0));
    }

    @Test
    public void should_get_6_when_1_add_2_add_3() throws Exception {
        double result = calculator.calculate("1+2+3");
        assertThat(result, is(6.0));
    }

    @Test
    public void should_get_10_when_3_add_2_multiply_2() throws Exception {
        double result = calculator.calculate("3+2*2");
        assertThat(result, is(10.0));
    }

    @Test
    public void should_get_8_when_8_divide_4_add_2_multiply_2() throws Exception {
        double result = calculator.calculate("8/4+2*2");
        assertThat(result, is(8.0));
    }
}
