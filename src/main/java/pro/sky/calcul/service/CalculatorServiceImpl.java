package pro.sky.calcul.service;

import org.springframework.stereotype.Service;
import pro.sky.calcul.exception.ZeroDivideException;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    // приветствие
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    //метод сложения
    @Override
    public int sum(int num1, int num2) {
        int sumNums = num1 + num2;
        return sumNums;
    }

    //метод вычитания
    @Override
    public int minus(int num1, int num2) {
        int minusNums = num1 - num2;
        return minusNums;
    }

    //метод умножения
    @Override
    public int multiply(int num1, int num2) {
        int multiplyNums = num1 * num2;
        return multiplyNums;
    }

    //метод деления
    @Override
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ZeroDivideException();
        }
        double divideNums = num1 / num2;
        return divideNums;
    }
}