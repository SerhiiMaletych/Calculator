package com.example.Calculator;

import com.example.Calculator.model.Operation;
import com.example.Calculator.service.CalculateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest

public class SqrtTests {

    @Autowired
    CalculateService calculateService;


    @Test
    public void testSqrt() {
        Operation op1 = new Operation(36);
        Operation op2 = new Operation(81);
        Operation op3 = new Operation(256);

        double result1 = calculateService.sqrt(op1);
        double result2 = calculateService.sqrt(op2);
        double result3 = calculateService.sqrt(op3);

        assertEquals(6, result1);
        assertEquals(9, result2);
        assertEquals(16, result3);

    }
}
