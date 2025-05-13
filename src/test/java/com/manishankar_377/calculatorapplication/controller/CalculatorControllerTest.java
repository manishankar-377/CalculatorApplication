package com.manishankar_377.calculatorapplication.controller;

import com.manishankar_377.calculatorapplication.model.CalculationRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {
//     Test cases for the CalculatorController class
//     You can use a testing framework like JUnit or TestNG to write your tests
//     Example test case:

    @Autowired
    private MockMvc mockMvc;


     @Test
     public void testCalculateAddition() {
         // Create a mock request
         CalculationRequest request = new CalculationRequest();
         request.setNum1(5.0);
         request.setNum2(3.0);
         request.setOperator("+");

         // Call the calculate method
         String result = new CalculatorController().calculate(request);

         // Assert the result
         assertEquals("8.0", result);
     }

    @Test
    public void testCalculateSubstraction() {
        // Create a mock request
        CalculationRequest request = new CalculationRequest();
        request.setNum1(5.0);
        request.setNum2(3.0);
        request.setOperator("-");

        // Call the calculate method
        String result = new CalculatorController().calculate(request);

        // Assert the result
        assertEquals("2.0", result);
    }

    @Test
    public void testCalculateMultiplication() {
        // Create a mock request
        CalculationRequest request = new CalculationRequest();
        request.setNum1(5.0);
        request.setNum2(3.0);
        request.setOperator("*");

        // Call the calculate method
        String result = new CalculatorController().calculate(request);

        // Assert the result
        assertEquals("15.0", result);
    }

    @Test
    public void testCalculateDivision() {
        // Create a mock request
        CalculationRequest request = new CalculationRequest();
        request.setNum1(6.0);
        request.setNum2(3.0);
        request.setOperator("/");

        // Call the calculate method
        String result = new CalculatorController().calculate(request);

        // Assert the result
        assertEquals("2.0", result);
    }

    @Test
    void testAddition() throws Exception {
        mockMvc.perform(get("/calculate/get")
                        .param("num1", "5")
                        .param("num2", "3")
                        .param("operator", "+"))
                .andExpect(status().isOk())
                .andExpect(content().string("8.0"));
    }

    @Test
    void testSubtraction() throws Exception {
        mockMvc.perform(get("/calculate/get")
                        .param("num1", "10")
                        .param("num2", "4")
                        .param("operator", "-"))
                .andExpect(status().isOk())
                .andExpect(content().string("6.0"));
    }

    @Test
    void testMultiplication() throws Exception {
        mockMvc.perform(get("/calculate/get")
                        .param("num1", "6")
                        .param("num2", "7")
                        .param("operator", "*"))
                .andExpect(status().isOk())
                .andExpect(content().string("42.0"));
    }

    @Test
    void testDivision() throws Exception {
        mockMvc.perform(get("/calculate/get")
                        .param("num1", "8")
                        .param("num2", "2")
                        .param("operator", "/"))
                .andExpect(status().isOk())
                .andExpect(content().string("4.0"));
    }

    @Test
    void testDivisionByZero() throws Exception {
        mockMvc.perform(get("/calculate/get")
                        .param("num1", "8")
                        .param("num2", "0")
                        .param("operator", "/"))
                .andExpect(status().isOk())
                .andExpect(content().string("Error: Division by zero is not allowed."));
    }

    @Test
    void testInvalidOperator() throws Exception {
        mockMvc.perform(get("/calculate/get")
                        .param("num1", "5")
                        .param("num2", "3")
                        .param("operator", "%"))
                .andExpect(status().isOk())
                .andExpect(content().string("Error: Invalid operator. Use +, -, *, or /."));
    }



}
