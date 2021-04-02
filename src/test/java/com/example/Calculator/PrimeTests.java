package com.example.Calculator;


import com.example.Calculator.model.Operation;
import com.example.Calculator.service.CalculateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PrimeTests {

    @Autowired
    CalculateService calculateService;

    @Test
    public void primeTest() {
        Operation op1 = new Operation(4);
        Operation op2 = new Operation(29);
        Operation op3 = new Operation(83);

        String result1 = calculateService.prime(op1);
        String result2 = calculateService.prime(op2);
        String result3 = calculateService.prime(op3);


        assertEquals("Not a prime number", result1);
        assertEquals("Prime number", result2);
        assertEquals("Prime number", result3);
    }
}
