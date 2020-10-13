package com.example.Calculator.service;


import com.example.Calculator.model.Operation;
import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    public int add(Operation model) {
        return model.getFirst() + model.getSecond();

    }

    public int subtract(Operation model) {
        return model.getFirst() - model.getSecond();
    }

    public int multiply(Operation model) {
        return model.getFirst() * model.getSecond();

    }

    public double divide(Operation model) {
        if (model.getFirst() == 0 || model.getSecond() == 0)
            return 0;
        return (double) model.getFirst() / model.getSecond();
    }

}
