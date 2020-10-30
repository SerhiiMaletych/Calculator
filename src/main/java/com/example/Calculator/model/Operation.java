package com.example.Calculator.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "operations")
public class Operation {

    @javax.persistence.Id
    private Long Id;

    public Operation(double first, double second) {
        this.first = first;
        this.second = second;
    }

    private double first;
    private double second;
    private String operation;
    private String result;






}
