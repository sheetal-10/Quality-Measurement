package com.quantitymeasurement;

import java.util.Objects;

public class Length {
    enum Unit{Feet, Inch};

    private final double value;
    private final Unit unit;
    private double Feet_To_Inch;

    public Length(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public double feetToInchConversion(){
        return value * 12;
    }

    public boolean compare(Length that) {
        if (this.unit.equals(Unit.Feet) && that.unit.equals(Unit.Feet))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.Feet) && that.unit.equals(Unit.Inch))
            return Double.compare(this.value * Feet_To_Inch, that.value) == 0;
        else
            return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

}
