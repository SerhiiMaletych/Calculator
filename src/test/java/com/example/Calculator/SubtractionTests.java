package com.example.Calculator;


import com.example.Calculator.model.Operation;
import com.example.Calculator.service.CalculateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SubtractionTests {
    @Autowired
    CalculateService calculateService;

    @Test
    public void testSubtract() {
        Operation op1 = new Operation(111, 222);
        Operation op2 = new Operation(10000, 50000);
        Operation op3 = new Operation(100000, 50000);

        assertEquals(-111, calculateService.subtract(op1));
        assertEquals(-40000, calculateService.subtract(op2));
        assertEquals(50000, calculateService.subtract(op3));


    }


}
