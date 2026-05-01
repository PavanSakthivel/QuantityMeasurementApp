package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.Length;
import com.apps.quantitymeasurement.Length.LengthUnit;

public class QuantityMeasurementAppTest {

    @Test
    public void testInchesInequality() {
        Length l1 = new Length(5.0, LengthUnit.INCHES);
        Length l2 = new Length(6.0, LengthUnit.INCHES);
        assertNotEquals(l1, l2);
    }

    @Test
    public void testCrossUnitInequality() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(1.0, LengthUnit.INCHES);
        assertNotEquals(l1, l2);
    }

    @Test
    public void testMultipleFeetComparison() {
        Length feet = new Length(2.0, LengthUnit.FEET);
        Length inches = new Length(24.0, LengthUnit.INCHES);
        assertEquals(feet, inches);
    }

    @Test
    public void yardEquals36Inches() {
        Length yard = new Length(1.0, LengthUnit.YARD);
        Length inches = new Length(36.0, LengthUnit.INCHES);
        assertEquals(yard, inches);
    }

    @Test
    public void centimeterEquals39Point3701Inches() {
        Length cm = new Length(100.0, LengthUnit.CM);
        Length inches = new Length(39.3701, LengthUnit.INCHES);
        assertEquals(cm, inches);
    }

    @Test
    public void threeFeetEqualsOneYard() {
        Length feet = new Length(3.0, LengthUnit.FEET);
        Length yard = new Length(1.0, LengthUnit.YARD);
        assertEquals(feet, yard);
    }

    @Test
    public void thirtyPoint48CmEqualsOneFoot() {
        Length cm = new Length(30.48, LengthUnit.CM);
        Length feet = new Length(1.0, LengthUnit.FEET);
        assertEquals(cm, feet);
    }

    @Test
    public void yardNotEqualToInches() {
        Length yard = new Length(1.0, LengthUnit.YARD);
        Length inches = new Length(30.0, LengthUnit.INCHES);
        assertNotEquals(yard, inches);
    }

    @Test
    public void referenceEqualitySameObject() {
        Length l = new Length(1.0, LengthUnit.FEET);
        assertEquals(l, l);
    }

    @Test
    public void equalsReturnsFalseForNull() {
        Length l = new Length(1.0, LengthUnit.FEET);
        assertFalse(l.equals(null));
    }

    @Test
    public void reflexiveSymmetricAndTransitiveProperty() {
        Length a = new Length(1.0, LengthUnit.FEET);
        Length b = new Length(12.0, LengthUnit.INCHES);
        Length c = new Length(30.48, LengthUnit.CM);

        assertEquals(a, a);
        assertEquals(a, b);
        assertEquals(b, a);
        assertEquals(b, c);
        assertEquals(a, c);
    }

    @Test
    public void differentValuesSameUnitNotEqual() {
        Length l1 = new Length(5.0, LengthUnit.FEET);
        Length l2 = new Length(6.0, LengthUnit.FEET);
        assertNotEquals(l1, l2);
    }

    @Test
    public void zeroLengthEquality() {
        Length l1 = new Length(0.0, LengthUnit.FEET);
        Length l2 = new Length(0.0, LengthUnit.INCHES);
        assertEquals(l1, l2);
    }

    @Test
    public void crossUnitEqualityDemonstrateMethod() {
        Length feet = new Length(1.0, LengthUnit.FEET);
        Length inches = new Length(12.0, LengthUnit.INCHES);
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(feet, inches));
    }

    @Test
    public void convertFeetToInches() {
        Length result = QuantityMeasurementApp.demonstrateLengthConversion(
                3.0, LengthUnit.FEET, LengthUnit.INCHES);

        Length expected = new Length(36.0, LengthUnit.INCHES);

        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(result, expected));
    }

    @Test
    public void convertYardsToInchesUsingOverloadedMethod() {
        Length yards = new Length(2.0, LengthUnit.YARD);

        Length result = QuantityMeasurementApp.demonstrateLengthConversion(
                yards, LengthUnit.INCHES);

        Length expected = new Length(72.0, LengthUnit.INCHES);

        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(result, expected));
    }

    @Test
    public void addFeetAndInches() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        Length result = QuantityMeasurementApp.demonstrateLengthAddition(l1, l2);

        Length expected = new Length(2.0, LengthUnit.FEET);

        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(result, expected));
    }

    @Test
    public void addFeetAndInchesWithTargetUnitInches() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        Length result = QuantityMeasurementApp.demonstrateLengthAddition(
                l1, l2, LengthUnit.INCHES);

        Length expected = new Length(24.0, LengthUnit.INCHES);

        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(result, expected));
    }
}