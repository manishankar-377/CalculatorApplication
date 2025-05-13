package com.manishankar_377.calculatorapplication.controller;

import com.manishankar_377.calculatorapplication.model.CalculationRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    @GetMapping("/get")
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

    @PostMapping("/post")
    public String calculate(@RequestBody CalculationRequest request) {

        if (request == null || request.getOperator() == null) {
            return "Error: Invalid request or operator is missing.";
        }

        double result;
        double num1 = request.getNum1();
        double num2 = request.getNum2();
        String operator = request.getOperator();

        switch (operator) {
            case "+": result = num1 + num2; break;
            case "-": result = num1 - num2; break;
            case "*": result = num1 * num2; break;
            case "/":
                if (num2 == 0) return "Error: Division by zero.";
                result = num1 / num2;
                break;
            default: return "Error: Invalid operator.";
        }
        return String.valueOf(result);
    }
}
