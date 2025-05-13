package com.manishankar_377.calculatorapplication.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    @GetMapping
    public String calculate(
            @RequestParam double num1,
            @RequestParam double num2,
            @RequestParam String operator) {

        double result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                if (num2 == 0) {
                    return "Error: Division by zero is not allowed.";
                }
                result = num1 / num2;
                break;

            default:
                return "Error: Invalid operator. Use +, -, *, or /.";
        }

        return String.valueOf(result);
    }
}
