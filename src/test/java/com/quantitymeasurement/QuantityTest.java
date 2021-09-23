package com.quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.Feet, 0.0);
        Length feet2 = new Length(Length.Unit.Feet, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNullFeet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.Feet, 0.0);
        Length feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.Feet, 0.0);
        Length feet2 = new Length(Length.Unit.Feet, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenType0Feetand1Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.Feet, 0.0);
        Length feet2 = new Length(Length.Unit.Feet, 1.0);
        Assertions.assertEquals(feet1.getClass(), feet2.getClass());
    }

    @Test
    public void givenFeetFromDifferentRefFeet_ShouldReturnFalse() {
        Length feet1 = new Length(Length.Unit.Feet, 0.0);
        Length feet2 = new Length(Length.Unit.Feet, 0.0);
        boolean result = feet2 == feet1;
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFeetFromSameRef_ShouldReturnTrue() {
        Length feet = new Length(Length.Unit.Feet, 0.0);
        boolean result = feet == feet;
        Assertions.assertTrue(result);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.Inch, 0.0);
        Length inch2 = new Length(Length.Unit.Inch, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNullInch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.Inch, 0.0);
        Length inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.Inch, 0.0);
        Length inch2 = new Length(Length.Unit.Inch, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenType0Inchand1Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.Inch, 0.0);
        Length inch2 = new Length(Length.Unit.Inch, 1.0);
        Assertions.assertEquals(inch1.getClass(), inch2.getClass());
    }

    @Test
    public void givenInchFromSameRef_ShouldReturnTrue() {
        Length inch = new Length(Length.Unit.Inch, 1.0);
        boolean result = inch == inch;
        Assertions.assertTrue(result);
    }

    @Test
    public void givenInchFromDiffRef_ShouldReturnFalse() {
        Length inch1 = new Length(Length.Unit.Inch, 1.0);
        Length inch2 = new Length(Length.Unit.Inch, 1.0);
        boolean result = inch1 == inch2;
        Assertions.assertFalse(result);
    }

    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.Feet, 1.0);
        Length inch1 = new Length(Length.Unit.Inch, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Feetand12Inch_WhenCompared_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.Feet, 1.0);
        Length inch1 = new Length(Length.Unit.Inch, 12.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given12Inchand1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length inch1 = new Length(Length.Unit.Inch, 12.0);
        Length feet1 = new Length(Length.Unit.Feet, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0Feetand0Inch_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.Feet, 0.0);
        Length inch1 = new Length(Length.Unit.Inch, 0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Inchand1Feet_WhenCompared_ShouldReturnNotEqualLength() {
        Length inch1 = new Length(Length.Unit.Feet, 1.0);
        Length feet1 = new Length(Length.Unit.Inch, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Feetand1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.Feet, 1.0);
        Length feet2 = new Length(Length.Unit.Feet, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Inchand1Inch_WhenCompared_ShouldReturnEqualLength() {
        Length inch1 = new Length(Length.Unit.Inch, 1.0);
        Length inch2 = new Length(Length.Unit.Inch, 1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0Yardand0Yard_ShouldReturnEqual() {
        Length yard1 = new Length(Length.Unit.Yard, 0.0);
        Length yard2 = new Length(Length.Unit.Yard, 0.0);
        boolean compareCheck = yard1.compare(yard2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0Yardand1Yard_ShouldReturnNotEqual() {
        Length yard1 = new Length(Length.Unit.Yard, 0.0);
        Length yard2 = new Length(Length.Unit.Yard, 1.0);
        boolean compareCheck = yard1.compare(yard2);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given0YardandNullYard_ShouldReturnNotEqual() {
        Length yard1 = new Length(Length.Unit.Yard, 0.0);
        Length yard2 = null;
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given3Feetand1Yard_WhenCompared_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.Feet, 3.0);
        Length yard1 = new Length(Length.Unit.Yard, 1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand1Yard_WhenCompared_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.Feet, 1.0);
        Length yard1 = new Length(Length.Unit.Yard, 1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Inchand1Yard_WhenCompared_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.Inch, 1.0);
        Length yard1 = new Length(Length.Unit.Yard, 1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Yardand36Inch_WhenCompared_ShouldReturnEqual() {
        Length yard1 = new Length(Length.Unit.Yard, 1.0);
        Length inch1 = new Length(Length.Unit.Inch, 36.0);
        boolean compareCheck = yard1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given36Inchand1Yard_WhenCompared_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.Inch, 36.0);
        Length yard1 = new Length(Length.Unit.Yard, 1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Yardand3Feet_WhenCompared_ShouldReturnEqual() {
        Length yard1 = new Length(Length.Unit.Yard, 1.0);
        Length feet1 = new Length(Length.Unit.Feet, 3.0);
        boolean compareCheck = yard1.compare(feet1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0Centimeterand0Centimeter_ShouldReturnEqual() {
        Length centimeter1 = new Length(Length.Unit.Centimeter, 0.0);
        Length centimeter2 = new Length(Length.Unit.Centimeter, 0.0);
        boolean compareCheck = centimeter1.compare(centimeter2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0Centimeterand1Centimeter_ShouldReturnNotEqual() {
        Length centimeter1 = new Length(Length.Unit.Centimeter, 0.0);
        Length centimeter2 = new Length(Length.Unit.Centimeter, 1.0);
        boolean compareCheck = centimeter1.compare(centimeter2);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given0CentimeterandNullCentimeter_ShouldReturnNotEqual() {
        Length centimeter1 = new Length(Length.Unit.Centimeter, 0.0);
        Length centimeter2 = null;
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void given2InchAnd5Centimeter_WhenCompared_ShouldReturnEqualLength() {
        Length inch1 = new Length(Length.Unit.Inch, 2.0);
        Length centimeter1 = new Length(Length.Unit.Centimeter, 5.0);
        boolean compareCheck = inch1.compare(centimeter1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given5CentimeterAnd2Inch_WhenCompared_ShouldReturnEqualLength() {
        Length centimeter1 = new Length(Length.Unit.Centimeter, 5.0);
        Length inch1 = new Length(Length.Unit.Inch, 2.0);
        boolean compareCheck = centimeter1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        Length inch1 = new Length(Length.Unit.Inch, 2.0);
        Length inch2 = new Length(Length.Unit.Inch, 2.0);
        Length expected = new Length(Length.Unit.Inch, 4.0);
        Length actual = inch1.sumOfLength(inch2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        Length feet1 = new Length(Length.Unit.Feet, 1.0);
        Length inch1 = new Length(Length.Unit.Inch, 2.0);
        Length expected = new Length(Length.Unit.Inch, 14.0);
        Length actual = feet1.sumOfLength(inch1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        Length feet1 = new Length(Length.Unit.Feet, 1.0);
        Length feet2 = new Length(Length.Unit.Feet, 1.0);
        Length expected = new Length(Length.Unit.Inch, 24.0);
        Length actual = feet1.sumOfLength(feet2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void given2Inch2point5Centimeter_WhenAdded_ShouldReturn3Inch() {
        Length inch = new Length(Length.Unit.Inch, 2.0);
        Length centimeter = new Length(Length.Unit.Centimeter, 2.5);
        Length expected = new Length(Length.Unit.Inch, 3.0);
        Length actual = inch.sumOfLength(centimeter);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void given0Gallonand0Gallon_ShouldReturnEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    public void given0Gallonand1Gallon_ShouldReturnNotEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given0GallonandNullGallon_ShouldReturnNotEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void givenType0Gallonand1Gallon_ShouldReturnEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 1.0);
        Assertions.assertEquals(gallon1.getClass(), gallon2.getClass());
    }

    @Test
    public void givenReference0Gallonand1Gallon_ShouldReturnNotEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given0Litreand0Litre_ShouldReturnEqual() {
        Volume litre1 = new Volume(Volume.Unit.LITRE, 0.0);
        Volume litre2 = new Volume(Volume.Unit.LITRE, 0.0);
        Assertions.assertEquals(litre1, litre2);
    }

    @Test
    public void given0Litreand1Litre_ShouldReturnNotEqual() {
        Volume litre1 = new Volume(Volume.Unit.LITRE, 0.0);
        Volume litre2 = new Volume(Volume.Unit.LITRE, 1.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    public void given0LitreandNullLitre_ShouldReturnNotEqual() {
        Volume litre1 = new Volume(Volume.Unit.LITRE, 0.0);
        Volume litre2 = null;
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    void given0GallonAnd0Litre_WhenCompared_ShouldReturnEqualVolume() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume litre1 = new Volume(Volume.Unit.LITRE, 0.0);
        boolean compareCheck = gallon1.compare(litre1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0GallonAnd1Litre_WhenCompared_ShouldReturnNotEqualVolume() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume litre1 = new Volume(Volume.Unit.LITRE, 1.0);
        boolean compareCheck = gallon1.compare(litre1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1GallonAnd3point78Litre_WhenCompared_ShouldReturnEqualVolume() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        Volume litre1 = new Volume(Volume.Unit.LITRE, 3.78);
        boolean compareCheck = gallon1.compare(litre1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given3point78LitreAnd1Gallon_WhenCompared_ShouldReturnEqualVolume() {
        Volume litre1 = new Volume(Volume.Unit.LITRE, 3.78);
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        boolean compareCheck = gallon1.compare(litre1);
        Assertions.assertTrue(compareCheck);
    }

}
