package com.example.Calculator;

import com.example.Calculator.model.Operation;
import com.example.Calculator.service.CalculateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class TrigonFunctionTests {
    @Autowired
    CalculateService calculateService;

    @Test
    public void testCos() {
        Operation operation = new Operation(60);
        Operation operation1 = new Operation(30);
        Operation operation2 = new Operation(120);
        Operation operation3 = new Operation(90);

        assertEquals(-0.96, calculateService.findCos(operation));
        assertEquals(0.15, calculateService.findCos(operation1));
        assertEquals(0.81, calculateService.findCos(operation2));
        assertEquals(-0.45, calculateService.findCos(operation3));


    }

    @Test
    public void testSin() {
        Operation operation = new Operation(30);
        Operation operation1 = new Operation(60);
        Operation operation2 = new Operation(90);
        Operation operation3 = new Operation(120);

        assertEquals(-0.99, calculateService.findSin(operation));
        assertEquals(-0.31, calculateService.findSin(operation1));
        assertEquals(0.89, calculateService.findSin(operation2));
        assertEquals(0.58, calculateService.findSin(operation3));


    }

    @Test
    public void testTan() {
        Operation operation = new Operation(30);
        Operation operation1 = new Operation(60);
        Operation operation2 = new Operation(90);
        Operation operation3 = new Operation(120);

        assertEquals(-6.41, calculateService.findTan(operation));
        assertEquals(0.32, calculateService.findTan(operation1));
        assertEquals(-2.0, calculateService.findTan(operation2));
        assertEquals(0.71, calculateService.findTan(operation3));


    }
}

