package com.example.Calculator.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Builder
@AllArgsConstructor
@Data
@Entity
@Table(name = "operations")
public class Operation {

    @javax.persistence.Id
    private Long Id;
    private double first;
    private double second;
    private String operation;
    private String result;

    public Operation() {

    }

    public Operation(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public Operation(double first) {
        this.first = first;

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }







}
