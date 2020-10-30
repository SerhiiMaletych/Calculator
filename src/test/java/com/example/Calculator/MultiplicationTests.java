package com.example.Calculator;


import com.example.Calculator.model.Operation;
import com.example.Calculator.service.CalculateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MultiplicationTests {

    @Autowired
    CalculateService calculateService;
    @Test
    public void testMultiply() {
        Operation op1 = new Operation(6.0, 2.0);
        Operation op2 = new Operation(100.0, 500.0);

        double result1 = calculateService.multiply(op1);
        double result2 = calculateService.multiply(op2);

        assertEquals(12.0, result1);
        assertEquals(50000.0, result2);

    }


}
