package com.example.Calculator;


import com.example.Calculator.model.Operation;
import com.example.Calculator.service.CalculateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MultiplicationTests {

    @Autowired
    CalculateService calculateService;

    @Test
    public void testMultiply() {
        Operation op1 = new Operation(6, 2);
        Operation op2 = new Operation(100, 500);

        assertEquals(12, calculateService.multiply(op1));
        assertEquals(50000, calculateService.multiply(op2));

    }

    @Test
    public void testMultiply2() {
        Operation op1 = new Operation(100, 100);
        Operation op2 = new Operation(50000, 300);

        assertEquals(10000, calculateService.multiply(op1));
        assertEquals(15000000, calculateService.multiply(op2));

    }


}
