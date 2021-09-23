package com.quantitymeasurement;

public enum Volume implements MeasurementUnits {
    MILLILITRE(0.001), LITRE(1), GALLON(3.78);

    private final double conversionValue;

    Volume(double conversionValue) {
        this.conversionValue = conversionValue;
    }

    @Override
    public double convertToBaseUnit(UnitMeasurementSystem units) {
        return units.value * conversionValue;
    }

    public boolean supportAddition() {
        return true;
    }
}
