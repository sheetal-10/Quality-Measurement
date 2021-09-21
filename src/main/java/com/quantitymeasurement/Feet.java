package com.quantitymeasurement;

import java.util.Objects;

public class Feet {
    private double value;

    public Feet(Double value) {
        this.value= value;
    }

    public double feetToInchConversion(){
        return value * 12;
    }

    public double feetToYardConversion(){
        return value / 3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }

}
