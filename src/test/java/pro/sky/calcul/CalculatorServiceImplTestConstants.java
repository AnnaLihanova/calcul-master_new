package pro.sky.calcul;

import org.junit.jupiter.api.Test;
import pro.sky.calcul.exception.ZeroDivideException;
import pro.sky.calcul.service.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.calcul.CalculatorServiceConstantsTest.*;

public class CalculatorServiceImplTestConstants {
    private CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    public void shouldReturnThreeWhenSum1And2() {
        assertEquals(THREE, calculatorService.sum(ONE, TWO));
    }

    @Test
    public void shouldReturnMinus2WhenMinus3And5() {
        assertEquals(MINUS_TWO, calculatorService.minus(THREE, FIVE));
    }
    @Test
    public void shouldReturnMinus10WhenMultiply5AndMinus2() {
        assertEquals(MINUS_TEN, calculatorService.multiply(FIVE, MINUS_TWO));
    }
    @Test
    public void shouldReturnZeroWhenDivide0And1() {
        assertEquals(ZERO, calculatorService.divide(ZERO, ONE));
    }
    @Test
    public void shouldReturnException() {
        assertThrows(ZeroDivideException.class, () -> calculatorService.divide(ONE, ZERO));
    }
}
