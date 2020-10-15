package com.example.Calculator.model;


public class Operation {


    private String operation;
    private double first;
    private double second;




    public Operation(String operation) {
        this.operation = operation;
    }


    public Operation(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public Operation() {

    }


    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
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




}
