package com.example.Calculator;


import com.example.Calculator.model.Operation;
import com.example.Calculator.service.CalculateService;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DivisionTests {

    @Autowired
    CalculateService calculateService;
    @Test
    public void testDivide() {
        Operation op1 = new Operation(10.0, 2.0);
        Operation op2 = new Operation(10000.0, 5000.0);

        double result1 = (double) calculateService.divide(op1);
        double result2 = (double) calculateService.divide(op2);

        assertEquals(5.0, result1);
        assertEquals(2.0, result2);

    }

    @Test
    public void testDivide2() {
        Operation op1 = new Operation(100000.0, 20.0);
        Operation op2 = new Operation(5000000.0, 2.0);

        double result1 = (double) calculateService.divide(op1);
        double result2 = (double) calculateService.divide(op2);

        assertEquals(5000.0, result1);
        assertEquals(2500000.0, result2);

    }


}
