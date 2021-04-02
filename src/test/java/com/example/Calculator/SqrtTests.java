package com.example.Calculator;

import com.example.Calculator.model.Operation;
import com.example.Calculator.service.CalculateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SqrtTests {

    @Autowired
    CalculateService calculateService;


    @Test
    public void testSqrt() {
        Operation op1 = new Operation(36);
        Operation op2 = new Operation(81);
        Operation op3 = new Operation(256);

        assertEquals(6, calculateService.sqrt(op1));
        assertEquals(9, calculateService.sqrt(op2));
        assertEquals(16, calculateService.sqrt(op3));

    }

    @Test
    public void testSqrt2() {
        Operation op1 = new Operation(900);
        Operation op2 = new Operation(62500);
        Operation op3 = new Operation(10000);

        assertEquals(30, calculateService.sqrt(op1));
        assertEquals(250, calculateService.sqrt(op2));
        assertEquals(100, calculateService.sqrt(op3));

    }
}
