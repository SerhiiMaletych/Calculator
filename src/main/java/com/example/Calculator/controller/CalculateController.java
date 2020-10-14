package com.example.Calculator.controller;

import com.example.Calculator.model.Operation;
import com.example.Calculator.service.CalculateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculateController {

    Operation operation = new Operation();
    final CalculateService service;

    public CalculateController(CalculateService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String getCalculatorPage(Model model){
        model.addAttribute("operation",operation);
        return "main-page";
    }
}
