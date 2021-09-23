package com.quantitymeasurement;

import java.util.Objects;

public enum Length implements MeasurementUnits {
    Feet(12.0), Inch(1.0), Yard(36.0), Centimeter(0.4);

    public final double conversionValue;


    Length(double conversionValue) {
        this.conversionValue = conversionValue;
    }

    @Override
    public double convertToBaseUnit(UnitMeasurementSystem units) {
        return (units.value * conversionValue);
    }

    public boolean supportAddition() {
        return true;
    }
}
