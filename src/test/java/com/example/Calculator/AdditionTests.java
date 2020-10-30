package com.example.Calculator;


import com.example.Calculator.model.Operation;
import com.example.Calculator.service.CalculateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class AdditionTests {
        @Autowired
        CalculateService calculateService;
    @Test
    public void testAdd() {
        Operation op1 = new Operation(1.0, 2.0);
        Operation op2 = new Operation(1000.0, 5000.0);

        double result1 = calculateService.add(op1);
        double result2 = calculateService.add(op2);

        assertEquals(3.0, result1);
        assertEquals(6000, result2);

    }





}
