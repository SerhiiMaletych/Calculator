package com.example.Calculator;


import com.example.Calculator.model.Operation;
import com.example.Calculator.service.CalculateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AdditionTests {
    @Autowired
    CalculateService calculateService;

    @Test
    public void testAdd() {
        Operation op1 = new Operation(1, 2);
        Operation op2 = new Operation(1000, 5000);

        assertEquals(3, calculateService.add(op1));
        assertEquals(6000, calculateService.add(op2));

    }

    @Test
    public void testAdd2() {
        Operation op1 = new Operation(10000, 20000);
        Operation op2 = new Operation(10000, 50000);

        assertEquals(30000, calculateService.add(op1));
        assertEquals(60000, calculateService.add(op2));

    }




}
