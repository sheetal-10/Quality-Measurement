package com.quantitymeasurement;

import java.util.Objects;

public class Length {
    enum Unit{Feet, Inch};

    private static final double FEET_TO_INCH = 12;

    private final double value;
    private final Unit unit;

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
            return Double.compare(this.value * FEET_TO_INCH, that.value) == 0;
        if (this.unit.equals(Unit.Inch) && that.unit.equals(Unit.Inch))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.Inch) && that.unit.equals(Unit.Feet))
            return Double.compare(this.value, that.value * FEET_TO_INCH) == 0;
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
