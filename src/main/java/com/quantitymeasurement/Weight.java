package com.quantitymeasurement;

public enum Weight implements MeasurementUnits {
    GRAM(0.001), KILOGRAM(1), TONNE(1000);

    private final double baseUnitConversion;

    Weight(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    @Override
    public double convertToBaseUnit(UnitMeasurementSystem units) {
        return units.value * baseUnitConversion;
    }

    public boolean supportAddition() {
        return true;
    }
}
