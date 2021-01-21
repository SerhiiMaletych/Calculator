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

    @Test
    public void testAdd2() {
        Operation op1 = new Operation(10000.0, 20000.0);
        Operation op2 = new Operation(10000.0, 50000.0);

        double result1 = calculateService.add(op1);
        double result2 = calculateService.add(op2);

        assertEquals(30000.0, result1);
        assertEquals(600000, result2);

    }





}
