package com.example.Calculator.service;


import com.example.Calculator.model.Operation;
import org.springframework.stereotype.Service;


@Service
public class CalculateService {

    public double add(Operation model) {
        return model.getFirst() + model.getSecond();

    }

    public double subtract(Operation model) {
        return model.getFirst() - model.getSecond();
    }

    public double multiply(Operation model) {
        return model.getFirst() * model.getSecond();

    }

    public Object divide(Operation model) {
        if (model.getSecond() == 0) {
            return "you can't divide by zero";
        }
        return model.getFirst() / model.getSecond();
    }

    public double sqrt(Operation model) {
        return Math.sqrt(model.getFirst());
    }

    public String prime(Operation model) {
        if (model.getFirst() <= 1)
            return "Not a prime number";

        else if (model.getFirst() == 2)
            return "Prime number";

        else if (model.getFirst() % 2 == 0)
            return "Not a prime number";
        for (int i = 3; i <= Math.sqrt(model.getFirst()); i = i + 2) {
            if (model.getFirst() % i == 0)
                return "Not a prime number";
        }
        return "Prime number";
    }


    public Operation clearResult(Operation model) {
        model.setFirst(0);
        model.setSecond(0);
        return model;
    }

}



