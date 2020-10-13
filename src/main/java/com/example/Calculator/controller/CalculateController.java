package com.example.Calculator.controller;

import com.example.Calculator.model.Operation;
import com.example.Calculator.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CalculateController {

    Operation operation = new Operation();
    final CalculateService service;

    public CalculateController(CalculateService service) {
        this.service = service;
    }
}
