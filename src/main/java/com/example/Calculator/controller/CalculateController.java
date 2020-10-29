package com.example.Calculator.controller;

import com.example.Calculator.model.Operation;
import com.example.Calculator.service.CalculateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class CalculateController {

    Operation operation = new Operation();
    final CalculateService service;

    public CalculateController(CalculateService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String getCalculatorPage(Model model) {
        model.addAttribute("operation", operation);
        return "main-page";
    }

    @PostMapping(value = "/", params = "add")
    public String add(@ModelAttribute("operation") Operation operation, Model model) {
        model.addAttribute("result", service.add(operation));
        return "main-page";
    }

    @PostMapping(value = "/", params = "subtract")
    public String subtract(@ModelAttribute("operation") Operation operation, Model model) {
        model.addAttribute("result", service.subtract(operation));
        return "main-page";
    }

    @PostMapping(value = "/", params = "multiply")
    public String multiply(@ModelAttribute("operation") Operation operation, Model model) {
        model.addAttribute("result", service.multiply(operation));
        return "main-page";
    }

    @PostMapping(value = "/", params = "divide")
    public String divide(@ModelAttribute("operation") Operation operation, Model model) {
        model.addAttribute("result", service.divide(operation));
        return "main-page";
    }
    @PostMapping(value="/", params="sqrt")
    public String sqrtValue(@ModelAttribute("operation")  Operation operation, Model model ){
        model.addAttribute("result", service.sqrt(operation));
        return "main-page";
    }

    @PostMapping(value = "/", params = "clear")
    public String clear(@ModelAttribute("operation") Operation operation, Model model) {
        model.addAttribute("operation", service.clearResult(operation));
        model.addAttribute("result", 0);
        return "main-page";
    }

}
