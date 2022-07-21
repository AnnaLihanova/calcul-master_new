package pro.sky.calcul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calcul.service.CalculatorService;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    //выведение приветственного слова
    @GetMapping(path = "/calculator")
    public String hello() {
        return calculatorService.hello();
    }

    //получение результатов сложения
    @GetMapping(path = "/calculator/plus")
    public String plusAnswer(@RequestParam("num") int num1, int num2) {
        return num1 + " + " + num2 + " = " + calculatorService.sum(num1, num2);
    }

    //получение результатов вычитания
    @GetMapping(path = "/calculator/minus")
    public String minusAnswer(@RequestParam("num") int num1, int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }

    //получение результатов умножения
    @GetMapping(path = "/calculator/multiply")
    public String multiplyAnswer(@RequestParam("num") int num1, int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    //получение результатов деления
    @GetMapping(path = "/calculator/divide")
    public String divideAnswer(@RequestParam("num") double num1, double num2) {
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
    }
}
