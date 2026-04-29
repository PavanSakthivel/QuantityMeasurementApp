package com.apps.quantitymeasurement;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Inches;

public class QuantityMeasurementAppTest {

    // ----------- FEET TESTS -----------

    @Test
    public void testFeetEquality_SameValue() {
        Feet f1 = new Feet(5.0);
        Feet f2 = new Feet(5.0);

        assertTrue(f1.equals(f2));
    }

    @Test
    public void testFeetEquality_DifferentValue() {
        Feet f1 = new Feet(5.0);
        Feet f2 = new Feet(7.0);

        assertFalse(f1.equals(f2));
    }

    @Test
    public void testFeetEquality_NullComparison() {
        Feet f1 = new Feet(5.0);

        assertFalse(f1.equals(null));
    }

    @Test
    public void testFeetEquality_DifferentClass() {
        Feet f1 = new Feet(5.0);
        String notFeet = "5.0";

        assertFalse(f1.equals(notFeet));
    }

    @Test
    public void testFeetEquality_SameReference() {
        Feet f1 = new Feet(5.0);

        assertTrue(f1.equals(f1));
    }

    // ----------- INCHES TESTS -----------

    @Test
    public void testInchesEquality_SameValue() {
        Inches i1 = new Inches(12.0);
        Inches i2 = new Inches(12.0);

        assertTrue(i1.equals(i2));
    }

    @Test
    public void testInchesEquality_DifferentValue() {
        Inches i1 = new Inches(12.0);
        Inches i2 = new Inches(24.0);

        assertFalse(i1.equals(i2));
    }

    @Test
    public void testInchesEquality_NullComparison() {
        Inches i1 = new Inches(12.0);

        assertFalse(i1.equals(null));
    }

    @Test
    public void testInchesEquality_DifferentClass() {
        Inches i1 = new Inches(12.0);
        Feet notInches = new Feet(1.0);

        assertFalse(i1.equals(notInches));
    }

    @Test
    public void testInchesEquality_SameReference() {
        Inches i1 = new Inches(12.0);

        assertTrue(i1.equals(i1));
    }
}