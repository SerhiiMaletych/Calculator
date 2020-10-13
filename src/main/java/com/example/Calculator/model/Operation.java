package com.example.Calculator.model;


public class Operation {


    private String operation;
    private int first;
    private int second;
    private int result;


    public Operation(int result) {
        this.result = result;
    }

    public Operation(String operation) {
        this.operation = operation;
    }


    public Operation(int first, int second) {
        this.first = first;
        this.second = second;
    }


    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }


}
