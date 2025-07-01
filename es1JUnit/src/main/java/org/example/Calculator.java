package org.example;

import java.util.stream.DoubleStream;

public class Calculator {

    static double add(double... operands) {
        if(operands == null || operands.length <=1){
            throw new IllegalArgumentException();
        }
        return DoubleStream.of(operands).sum(); //fluxo de objetos do tipo double
    }

    static double multiply(double... operands){
        return DoubleStream.of(operands).reduce(1, (a, b) -> a*b); //1 valor ao final, funcao de multiplicacao
    }



}
