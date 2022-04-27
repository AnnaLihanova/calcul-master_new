package pro.sky.calcul;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int sum(int num1, int num2) {
        int sumNums = num1 + num2;
        return sumNums;
    }

    @Override
    public int minus(int num1, int num2) {
        int minusNums = num1 - num2;
        return minusNums;
    }

    @Override
    public int multiply(int num1, int num2) {
        int multiplyNums = num1 * num2;
        return multiplyNums;
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ZeroDivideException();
        }
        double divideNums = num1 / num2;
        return divideNums;
    }
}