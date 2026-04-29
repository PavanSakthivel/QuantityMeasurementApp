package com.apps.quantitymeasurement;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.Length;
import com.apps.quantitymeasurement.Length.LengthUnit;

public class QuantityMeasurementAppTest {

    @Test
    public void testFeetEquality() {
        Length f1 = new Length(1.0, LengthUnit.FEET);
        Length f2 = new Length(1.0, LengthUnit.FEET);

        assertEquals(f1, f2);
    }

    @Test
    public void testInchesEquality() {
        Length i1 = new Length(12.0, LengthUnit.INCHES);
        Length i2 = new Length(12.0, LengthUnit.INCHES);

        assertEquals(i1, i2);
    }

    @Test
    public void testFeetInchesComparison() {
        Length feet = new Length(1.0, LengthUnit.FEET);
        Length inches = new Length(12.0, LengthUnit.INCHES);

        assertEquals(feet, inches);
    }

    @Test
    public void testFeetInequality() {
        Length f1 = new Length(1.0, LengthUnit.FEET);
        Length f2 = new Length(2.0, LengthUnit.FEET);

        assertNotEquals(f1, f2);
    }

    @Test
    public void testInchesInequality() {
        Length i1 = new Length(12.0, LengthUnit.INCHES);
        Length i2 = new Length(24.0, LengthUnit.INCHES);

        assertNotEquals(i1, i2);
    }

    @Test
    public void testCrossUnitInequality() {
        Length feet = new Length(1.0, LengthUnit.FEET);
        Length inches = new Length(10.0, LengthUnit.INCHES);

        assertNotEquals(feet, inches);
    }

    @Test
    public void testMultipleFeetComparison() {
        Length feet = new Length(2.0, LengthUnit.FEET);
        Length inches = new Length(24.0, LengthUnit.INCHES);

        assertEquals(feet, inches);
    }

    // ----------- NEW UNIT TESTS -----------

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
}