package pro.sky.calcul;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/calculator/plus")
    public String plusAnswer(@RequestParam("num") int num1, int num2) {
        return num1 + " + " + num2 + " = " +calculatorService.sum(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minusAnswer(@RequestParam("num") int num1, int num2) {
        return num1 + " - " + num2 + " = " +calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplyAnswer(@RequestParam("num") int num1, int num2) {
        return num1 + " * " + num2 + " = " +calculatorService.multiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divideAnswer(@RequestParam("num") int num1, int num2) {
        return num1 + " / " + num2 + " = " +calculatorService.divide(num1, num2);
    }
}
