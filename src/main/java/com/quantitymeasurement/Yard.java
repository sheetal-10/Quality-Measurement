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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Yard yard = (Yard) o;
        return Double.compare(yard.value, value) == 0;
    }
}
