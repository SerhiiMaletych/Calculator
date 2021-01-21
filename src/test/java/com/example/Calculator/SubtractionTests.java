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
public class SubtractionTests {
    @Autowired
    CalculateService calculateService;
    @Test
    public void testSubtract() {
        Operation op1 = new Operation(111.0, 222.0);
        Operation op2 = new Operation(10000.0, 50000.0);
        Operation op3 = new Operation(100000.0, 50000.0);

        double result1 = calculateService.subtract(op1);
        double result2 = calculateService.subtract(op2);
        double result3 = calculateService.subtract(op3);

        assertEquals(-111.0, result1);
        assertEquals(-40000.0, result2);
        assertEquals(50000.0, result3);


    }



}
