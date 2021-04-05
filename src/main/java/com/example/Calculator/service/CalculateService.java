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

    public double divide(Operation model) {

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
        for (int i = 2; i <= Math.sqrt(model.getFirst()); i++) {
            if (model.getFirst() % i == 0)
                return "Not a prime number";
        }
        return "Prime number";
    }

    public double power(Operation model) {
        return model.getFirst()*model.getFirst();
    }

    public double findCos(Operation model) {
        return Math.floor(Math.cos(model.getFirst())*100)/100;
    }

    public double findSin(Operation model) {
        return Math.floor(Math.sin(model.getFirst())*100)/100;
    }

    public double findTan(Operation model) {
        return Math.floor(Math.tan(model.getFirst())*100)/100;

    }

    public double findLog(Operation model) {
        return Math.log(model.getFirst());
    }


    public Operation clearResult(Operation model) {
        model.setFirst(0);
        model.setSecond(0);
        return model;
    }

}



