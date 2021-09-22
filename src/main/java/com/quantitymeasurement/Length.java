package com.quantitymeasurement;

import java.util.Objects;

public class Length {
    enum Unit{Feet, Inch};

    private final double value;
    private final Unit unit;

    public Length(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public double feetToInchConversion(){
        return value * 12;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

}
