package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.Length;
import com.apps.quantitymeasurement.Length.LengthUnit;
import com.apps.quantitymeasurement.Weight;
import com.apps.quantitymeasurement.Weight.WeightUnit;

public class QuantityMeasurementAppTest {

    @Test
    public void kilogramEquals1000Grams() {
        Weight kg = new Weight(1.0, WeightUnit.KG);
        Weight g = new Weight(1000.0, WeightUnit.GRAM);
        assertEquals(kg, g);
    }

    @Test
    public void poundEquals453Point592Grams() {
        Weight pound = new Weight(1.0, WeightUnit.POUND);
        Weight grams = new Weight(453.592, WeightUnit.GRAM);
        assertEquals(pound, grams);
    }

    @Test
    public void tonneEquals1000000Grams() {
        Weight tonne = new Weight(1.0, WeightUnit.TONNE);
        Weight grams = new Weight(1000000.0, WeightUnit.GRAM);
        assertEquals(tonne, grams);
    }

    @Test
    public void kilogramNotEqualToPound() {
        Weight kg = new Weight(1.0, WeightUnit.KG);
        Weight pound = new Weight(1.0, WeightUnit.POUND);
        assertNotEquals(kg, pound);
    }

    @Test
    public void additionOfWeightsEqualsExpected() {
        Weight w1 = new Weight(1.0, WeightUnit.KG);
        Weight w2 = new Weight(500.0, WeightUnit.GRAM);

        Weight result = QuantityMeasurementApp.demonstrateWeightAddition(w1, w2);

        Weight expected = new Weight(1.5, WeightUnit.KG);

        assertTrue(QuantityMeasurementApp.demonstrateWeightEquality(result, expected));
    }

    @Test
    public void testFeetEquality() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(1.0, LengthUnit.FEET);
        assertEquals(l1, l2);
    }

    @Test
    public void testInchesEquality() {
        Length l1 = new Length(5.0, LengthUnit.INCHES);
        Length l2 = new Length(5.0, LengthUnit.INCHES);
        assertEquals(l1, l2);
    }

    @Test
    public void testFeetInchesComparison() {
        Length feet = new Length(1.0, LengthUnit.FEET);
        Length inches = new Length(12.0, LengthUnit.INCHES);
        assertEquals(feet, inches);
    }

    @Test
    public void testFeetInequality() {
        Length l1 = new Length(2.0, LengthUnit.FEET);
        Length l2 = new Length(3.0, LengthUnit.FEET);
        assertNotEquals(l1, l2);
    }

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
}