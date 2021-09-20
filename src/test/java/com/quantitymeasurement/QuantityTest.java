package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    //testcase for 0 feet and 0 feet should return true
    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet (0.0);
        Feet feet2 = new Feet (0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNullFeet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet (0.0);
        Feet feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }
}
