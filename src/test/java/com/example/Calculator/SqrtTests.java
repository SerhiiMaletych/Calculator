package com.example.Calculator;

import com.example.Calculator.model.Operation;
import com.example.Calculator.service.CalculateService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
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

    @Test
    public void testSqrt2() {
        Operation op1 = new Operation(900);
        Operation op2 = new Operation(62500);
        Operation op3 = new Operation(10000);

        double result1 = calculateService.sqrt(op1);
        double result2 = calculateService.sqrt(op2);
        double result3 = calculateService.sqrt(op3);

        assertEquals(30, result1);
        assertEquals(250, result2);
        assertEquals(100, result3);

    }
}
