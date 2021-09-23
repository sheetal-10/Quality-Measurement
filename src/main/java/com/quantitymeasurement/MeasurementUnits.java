package com.quantitymeasurement;

public interface MeasurementUnits {
    double convertToBaseUnit(UnitMeasurementSystem units);
    boolean supportAddition();
}
