package com.quantitymeasurement;

public class Yard {
    private final double value;

    public Yard(double value) {
        this.value = value;
    }

    public double yardToFeetConversion(){
        return value * 3;
    }

    public double yardToInchConversion(){
        return value * 36;
    }

}
