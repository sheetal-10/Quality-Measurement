package com.quantitymeasurement;

import java.util.Objects;

/**
 * Inch class to call value
 * @author sheetal
 * @since 2021-09-20
 */
public class Inch {
    //variable
    private final double value;

    //passing value through constructor
    public Inch(double value) {
        this.value=value;
    }

    //overriding equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Double.compare(inch.value, value) == 0;
    }

}
