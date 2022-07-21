package pro.sky.calcul;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.calcul.exception.ZeroDivideException;
import pro.sky.calcul.service.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private double num5;
    private double num6;
    private double num7;
    private double num8;

    @BeforeEach
    public void assignValues() {
        num1 = 1;
        num2 = -3;
        num3 = 7;
        num4 = 0;
        num5 = 2;
        num6 = -6;
        num7 = 0;
        num8 = 7;
    }

    @Test
    public void shouldReturnSum() {
        int actual1 = num1 + num2;
        int actual2 = num3 + num4;
        assertEquals(calculatorService.sum(num1, num2), actual1);
        assertEquals(calculatorService.sum(num3, num4), actual2);
    }
    @Test
    public void shouldReturnMinus() {
        int actual1 = num1 - num2;
        int actual2 = num3 - num4;
        assertEquals(calculatorService.minus(num1, num2), actual1);
        assertEquals(calculatorService.minus(num3, num4), actual2);
    }
    @Test
    public void shouldReturnMultiply() {
        int actual1 = num1 * num2;
        int actual2 = num3 * num4;
        assertEquals(calculatorService.multiply(num1, num2), actual1);
        assertEquals(calculatorService.multiply(num3, num4), actual2);
    }
    @Test
    public void shouldReturnDivide() {
        double actual1 = num5 / num6;
        double actual2 = num7 / num8;
        assertEquals(calculatorService.divide(num5, num6), actual1);
        assertEquals(calculatorService.divide(num7, num8), actual2);
    }

    @Test
    public void shouldReturnException() {
        assertThrows(ZeroDivideException.class, () -> calculatorService.divide(num8, num7));
    }
}
