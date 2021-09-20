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

    //testcase for null check of feet
    @Test
    public void given0FeetAndNullFeet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet (0.0);
        Feet feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }

    //testcase for 0 feet and 1 feet equality check
    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet (0.0);
        Feet feet2 = new Feet (1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    //testcase for 0 inch and 0 inch should return true
    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch (0.0);
        Inch inch2 = new Inch (0.0);
        Assert.assertEquals(inch1, inch2);
    }

    //testcase for null check of inch
    @Test
    public void given0InchAndNullInch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch (0.0);
        Inch inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

}
