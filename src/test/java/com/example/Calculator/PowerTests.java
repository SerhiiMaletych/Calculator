package com.example.Calculator;

import com.example.Calculator.model.Operation;
import com.example.Calculator.service.CalculateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PowerTests {
    @Autowired
    CalculateService calculateService;

    @Test
    public void testPower() {
        Operation operation1 = new Operation(10);
        Operation operation2 = new Operation(100);
        Operation operation3 = new Operation(25);
        Operation operation4 = new Operation(200);
        Operation operation5 = new Operation(60);

        assertEquals(calculateService.power(operation1),100);
        assertEquals(calculateService.power(operation2),10000);
        assertEquals(calculateService.power(operation3),625);
        assertEquals(calculateService.power(operation4),40000);
        assertEquals(calculateService.power(operation5),3600);


    }

    @Test
    public void testPower2() {
        Operation operation1 = new Operation(10000);
        Operation operation2 = new Operation(3333);
        Operation operation3 = new Operation(25252);
        Operation operation4 = new Operation(1411);
        Operation operation5 = new Operation(3789);

        assertEquals(calculateService.power(operation1),100000000);
        assertEquals(calculateService.power(operation2),11108889);
        assertEquals(calculateService.power(operation3),637663504);
        assertEquals(calculateService.power(operation4),1990921);
        assertEquals(calculateService.power(operation5),14356521);
    }
}
