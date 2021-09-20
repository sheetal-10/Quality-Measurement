package com.quantitymeasurement;

import java.util.Objects;

/**
 * Feet class to call value
 * @author sheetal
 * @since 2021-09-20
 */
public class Feet {

    //variable
    private double value;

    //passing the variable through constructor
    public Feet(Double value) {
        this.value= value;
    }

    //overriding equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }

}
