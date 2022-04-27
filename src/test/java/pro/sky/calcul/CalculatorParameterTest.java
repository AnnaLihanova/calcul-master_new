package pro.sky.calcul;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorParameterTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(1, 8),
                Arguments.of(2, -3),
                Arguments.of(0, 5),
                Arguments.of(12, -3)
                );
    }

    public static Stream<Arguments> parametersForException() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(12, 0),
                Arguments.of(-6, 0)
                );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void shouldReturnSum(int num1, int num2) {
        assertEquals(calculatorService.sum(num1, num2), num1 + num2);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void shouldReturnMinus(int num1, int num2) {
        assertEquals(calculatorService.minus(num1, num2), num1 - num2);
    }
    @ParameterizedTest
    @MethodSource("parameters")
    public void shouldReturnMultiply(int num1, int num2) {
        assertEquals(calculatorService.multiply(num1, num2), num1 * num2);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void shouldReturnDivide(double num1, double num2) {
        assertEquals(calculatorService.divide(num1, num2), num1 / num2);
    }
    @ParameterizedTest
    @MethodSource("parametersForException")
    public void shouldReturnException(double num1, double num2) {
        assertThrows(ZeroDivideException.class, () -> calculatorService.divide(num1, num2));
    }
}
