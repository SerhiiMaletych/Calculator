package com.example.Calculator;


import com.example.Calculator.model.Operation;
import com.example.Calculator.service.CalculateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DivisionTests {

    @Autowired
    CalculateService calculateService;

    @Test
    public void testDivide() {
        Operation op1 = new Operation(10, 2);
        Operation op2 = new Operation(10000, 5000);

        assertEquals(5, calculateService.divide(op1));
        assertEquals(2, calculateService.divide(op2));

    }

    @Test
    public void testDivide2() {
        Operation op1 = new Operation(100000, 20);
        Operation op2 = new Operation(5000000, 2);

        assertEquals(calculateService.divide(op1),5000 );
        assertEquals(calculateService.divide(op2),2500000 );

    }


}
