package com.quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.Feet, 0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.Feet, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNullFeet_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.Feet, 0.0);
        UnitMeasurementSystem feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.Feet, 0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.Feet, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenType0Feetand1Feet_ShouldReturnEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.Feet, 0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.Feet, 1.0);
        Assertions.assertEquals(feet1.getClass(), feet2.getClass());
    }

    @Test
    public void givenFeetFromDifferentRefFeet_ShouldReturnFalse() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.Feet, 0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.Feet, 0.0);
        boolean result = feet2 == feet1;
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFeetFromSameRef_ShouldReturnTrue() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.Feet, 0.0);
        boolean result = feet == feet;
        Assertions.assertTrue(result);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.Inch, 0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.Inch, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNullInch_ShouldReturnNotEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.Inch, 0.0);
        UnitMeasurementSystem inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.Inch, 0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.Inch, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenType0Inchand1Inch_ShouldReturnEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.Inch, 0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.Inch, 1.0);
        Assertions.assertEquals(inch1.getClass(), inch2.getClass());
    }

    @Test
    public void givenInchFromSameRef_ShouldReturnTrue() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.Inch, 1.0);
        boolean result = inch == inch;
        Assertions.assertTrue(result);
    }

    @Test
    public void givenInchFromDiffRef_ShouldReturnFalse() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.Inch, 1.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.Inch, 1.0);
        boolean result = inch1 == inch2;
        Assertions.assertFalse(result);
    }

    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.Feet, 1.0);
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.Inch, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Feetand12Inch_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.Feet, 1.0);
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.Inch, 12.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given12Inchand1Feet_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.Inch, 12.0);
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.Feet, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0Feetand0Inch_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.Feet, 0.0);
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.Inch, 0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Inchand1Feet_WhenCompared_ShouldReturnNotEqualLength() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.Feet, 1.0);
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.Inch, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Feetand1Feet_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.Feet, 1.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.Feet, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Inchand1Inch_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.Inch, 1.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.Inch, 1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0Yardand0Yard_ShouldReturnEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.Yard, 0.0);
        UnitMeasurementSystem yard2 = new UnitMeasurementSystem(Length.Yard, 0.0);
        boolean compareCheck = yard1.compare(yard2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0Yardand1Yard_ShouldReturnNotEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.Yard, 0.0);
        UnitMeasurementSystem yard2 = new UnitMeasurementSystem(Length.Yard, 1.0);
        boolean compareCheck = yard1.compare(yard2);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given0YardandNullYard_ShouldReturnNotEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.Yard, 0.0);
        UnitMeasurementSystem yard2 = null;
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given3Feetand1Yard_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.Feet, 3.0);
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.Yard, 1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand1Yard_WhenCompared_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.Feet, 1.0);
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.Yard, 1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Inchand1Yard_WhenCompared_ShouldReturnNotEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.Inch, 1.0);
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.Yard, 1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Yardand36Inch_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.Yard, 1.0);
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.Inch, 36.0);
        boolean compareCheck = yard1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given36Inchand1Yard_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.Inch, 36.0);
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.Yard, 1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Yardand3Feet_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.Yard, 1.0);
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.Feet, 3.0);
        boolean compareCheck = yard1.compare(feet1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0Centimeterand0Centimeter_ShouldReturnEqual() {
        UnitMeasurementSystem centimeter1 = new UnitMeasurementSystem(Length.Centimeter, 0.0);
        UnitMeasurementSystem centimeter2 = new UnitMeasurementSystem(Length.Centimeter, 0.0);
        boolean compareCheck = centimeter1.compare(centimeter2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0Centimeterand1Centimeter_ShouldReturnNotEqual() {
        UnitMeasurementSystem centimeter1 = new UnitMeasurementSystem(Length.Centimeter, 0.0);
        UnitMeasurementSystem centimeter2 = new UnitMeasurementSystem(Length.Centimeter, 1.0);
        boolean compareCheck = centimeter1.compare(centimeter2);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given0CentimeterandNullCentimeter_ShouldReturnNotEqual() {
        UnitMeasurementSystem centimeter1 = new UnitMeasurementSystem(Length.Centimeter, 0.0);
        UnitMeasurementSystem centimeter2 = null;
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void given2InchAnd5Centimeter_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.Inch, 2.0);
        UnitMeasurementSystem centimeter1 = new UnitMeasurementSystem(Length.Centimeter, 5.0);
        boolean compareCheck = inch1.compare(centimeter1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given5CentimeterAnd2Inch_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem centimeter1 = new UnitMeasurementSystem(Length.Centimeter, 5.0);
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.Inch, 2.0);
        boolean compareCheck = centimeter1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        try {
            UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.Inch, 2.0);
            UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.Inch, 2.0);
            UnitMeasurementSystem expected = new UnitMeasurementSystem(Length.Inch, 4.0);
            UnitMeasurementSystem actual = inch1.addition(inch2, Length.Inch);
            Assertions.assertEquals(expected, actual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        try {
            UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.Feet, 1.0);
            UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.Inch, 2.0);
            UnitMeasurementSystem expected = new UnitMeasurementSystem(Length.Inch, 14.0);
            UnitMeasurementSystem actual = feet1.addition(inch1, Length.Inch);
            Assertions.assertEquals(expected, actual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        try {
            UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.Feet, 1.0);
            UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.Feet, 1.0);
            UnitMeasurementSystem expected = new UnitMeasurementSystem(Length.Inch, 24.0);
            UnitMeasurementSystem actual = feet1.addition(feet2, Length.Inch);
            Assertions.assertEquals(expected, actual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given2Inch2point5Centimeter_WhenAdded_ShouldReturn3Inch() {
        try {
            UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.Inch, 2.0);
            UnitMeasurementSystem centimeter = new UnitMeasurementSystem(Length.Centimeter, 2.5);
            UnitMeasurementSystem expected = new UnitMeasurementSystem(Length.Inch, 3.0);
            UnitMeasurementSystem actual = inch.addition(centimeter, Length.Inch);
            Assertions.assertEquals(expected, actual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0Gallonand0Gallon_ShouldReturnEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    public void given0Gallonand1Gallon_ShouldReturnNotEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given0GallonandNullGallon_ShouldReturnNotEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void givenType0Gallonand1Gallon_ShouldReturnEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        Assertions.assertEquals(gallon1.getClass(), gallon2.getClass());
    }

    @Test
    public void givenReference0Gallonand1Gallon_ShouldReturnNotEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given0Litreand0Litre_ShouldReturnEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        Assertions.assertEquals(litre1, litre2);
    }

    @Test
    public void given0Litreand1Litre_ShouldReturnNotEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    public void given0LitreandNullLitre_ShouldReturnNotEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        UnitMeasurementSystem litre2 = null;
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    public void given0GallonAnd0Litre_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        boolean compareCheck = gallon1.compare(litre1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0GallonAnd1Litre_WhenCompared_ShouldReturnNotEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        boolean compareCheck = gallon1.compare(litre1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1GallonAnd3point78Litre_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 3.78);
        boolean compareCheck = gallon1.compare(litre1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given3point78LitreAnd1Gallon_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 3.78);
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        boolean compareCheck = gallon1.compare(litre1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0LiterAnd0MilliLitre_WhenCompared_ShouldReturnNotEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(Volume.MILLILITRE, 0.0);
        boolean compareCheck = litre1.compare(millilitre1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1LiterAnd1000MilliLitre_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(Volume.MILLILITRE, 1000.0);
        boolean compareCheck = litre1.compare(millilitre1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1000MilliLitreAnd1Litre_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(Volume.MILLILITRE, 1000.0);
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        boolean compareCheck = millilitre1.compare(litre1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd3point78Litre_WhenAdded_ShouldReturn7point57Liter() {
        try {
            UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
            UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 3.78);
            UnitMeasurementSystem expected = new UnitMeasurementSystem(Volume.LITRE, 7.56);
            UnitMeasurementSystem actual = gallon1.addition(litre1, Volume.LITRE);
            Assertions.assertEquals(expected, actual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1LitreAnd1000MilliLitre_WhenAdded_ShouldReturn2Liter() {
        try {
            UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 1.0);
            UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(Volume.MILLILITRE, 1000.0);
            UnitMeasurementSystem expected = new UnitMeasurementSystem(Volume.LITRE, 2.0);
            UnitMeasurementSystem actual = litre1.addition(millilitre1, Volume.LITRE);
            Assertions.assertEquals(expected, actual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0Gramand0Gram_ShouldReturnEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM, 0.0);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(Weight.GRAM, 0.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    public void given0Gramand1Gram_ShouldReturnNotEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM, 0.0);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(Weight.GRAM, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given0GramandNULLGram_ShouldReturnNotEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM, 0.0);
        UnitMeasurementSystem gram2 = null;
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void givenType0Gramand0Gram_ShouldReturnEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM, 0.0);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(Weight.GRAM, 1.0);
        Assertions.assertEquals(gram1.getClass(), gram2.getClass());
    }

    @Test
    public void givenReference0Gramand0Gram_ShouldReturnNotEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM, 0.0);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(Weight.GRAM, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given1KilogramAnd1000Gram_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(Weight.KILOGRAM, 1.0);
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM, 1000.0);
        boolean compareCheck = kilogram1.compare(gram1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1000GramAnd1Kilogram_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM, 1000.0);
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(Weight.KILOGRAM, 1.0);
        boolean compareCheck = gram1.compare(kilogram1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Kilogram_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(Weight.TONNE, 1.0);
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(Weight.KILOGRAM, 1000.0);
        boolean compareCheck = tonne1.compare(kilogram1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1000KilogramAnd1Tonne_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(Weight.KILOGRAM, 1000.0);
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(Weight.TONNE, 1.0);
        boolean compareCheck = tonne1.compare(kilogram1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Gram_WhenAdded_ShouldReturn1001KG() {
        try {
            UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(Weight.TONNE, 1.0);
            UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM, 1000.0);
            UnitMeasurementSystem expectedSum = new UnitMeasurementSystem(Weight.KILOGRAM, 1001.0);
            UnitMeasurementSystem actualSum = tonne1.addition(gram1, Weight.KILOGRAM);
            Assertions.assertEquals(expectedSum, actualSum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0FahrenheitAnd0Fahrenheit_ShouldReturnEqualTemperature() {
        Temperature temperature1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temperature2 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Assertions.assertEquals(temperature1, temperature2);
    }

    @Test
    public void given0FahrenheitAnd1Fahrenheit_ShouldReturnNotEqualTemperature() {
        Temperature temperature21 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temperature22 = new Temperature(Temperature.Unit.FAHRENHEIT, 1.0);
        Assertions.assertNotEquals(temperature21, temperature22);
    }

    @Test
    public void given0FahrenheitAndNull_ShouldReturnNotEqualTemperature() {
        Temperature temperature1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temperature2 = null;
        Assertions.assertNotEquals(temperature1, temperature2);
    }

    @Test
    public void givenType0FahrenheitAnd1Fahrenheit_ShouldReturnEqual() {
        Temperature temperature1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temperature2 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Assertions.assertEquals(temperature1.getClass(), temperature2.getClass());
    }

    @Test
    public void givenReference0FahrenheitAnd1Fahrenheit_ShouldReturnNotEqual() {
        Temperature temperature1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temperature2 = new Temperature(Temperature.Unit.FAHRENHEIT, 1.0);
        Assertions.assertNotEquals(temperature1, temperature2);
    }

    @Test
    public void given212FahrenheitAnd100Celsius_WhenCompared_ShouldReturnEqualTemperature() {
        Temperature fahrenheit = new Temperature(Temperature.Unit.FAHRENHEIT, 212.0);
        Temperature celsius = new Temperature(Temperature.Unit.CELSIUS, 100.0);
        boolean compareCheck = fahrenheit.compare(celsius);
        Assertions.assertTrue(compareCheck);
    }
}
