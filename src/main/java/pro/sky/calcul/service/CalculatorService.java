package pro.sky.calcul.service;

public interface CalculatorService {
    String hello();
//сложение
    int sum(int num1, int num2);
//вычитание
    int minus(int num1, int num2);
//умножение
    int multiply(int num1, int num2);
//деление
    double divide(double num1, double num2);
}