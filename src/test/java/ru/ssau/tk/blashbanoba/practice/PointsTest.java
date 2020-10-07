package ru.ssau.tk.blashbanoba.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointsTest {
    private static final double DELTA = 0.0001;

    private Point getFirstPoint() {
        return new Point(2.7, 4.7, 2.9);
    }

    private Point getSecondPoint() {
        return new Point(0.2, 2.1, 9.3);
    }

    @Test
    public void testSum() {
        Point result = Points.sum(getFirstPoint(), getSecondPoint());
        assertEquals(result.x, 2.9, DELTA);
        assertEquals(result.y, 6.8, DELTA);
        assertEquals(result.z, 12.2, DELTA);
        assertNotEquals(result.x, Double.NaN);
        assertNotEquals(result.y, Double.NaN);
        assertNotEquals(result.z, Double.NaN);
    }

    @Test
    public void testSubtract() {
        Point result = Points.subtract(getFirstPoint(),getSecondPoint());
        assertEquals(result.x, 2.5, DELTA);
        assertEquals(result.y, 2.6, DELTA);
        assertEquals(result.z, -6.4, DELTA);
        assertNotEquals(result.x, Double.NaN);
        assertNotEquals(result.y, Double.NaN);
        assertNotEquals(result.z, Double.NaN);
    }

    @Test
    public void testMultiply() {
        Point result = Points.multiply(getFirstPoint(),getSecondPoint());
        assertEquals(result.x, 0.54, DELTA);
        assertEquals(result.y, 9.87, DELTA);
        assertEquals(result.z, 26.97, DELTA);
        assertNotEquals(result.x, Double.NaN);
        assertNotEquals(result.y, Double.NaN);
        assertNotEquals(result.z, Double.NaN);
    }

    @Test
    public void testDivide() {
        Point result = Points.divide(getFirstPoint(),getSecondPoint());
        assertEquals(result.x, 13.5, DELTA);
        assertEquals(result.y, 2.238, DELTA);
        assertEquals(result.z, 0.3118, DELTA);
        assertNotEquals(result.x, Double.NaN);
        assertNotEquals(result.y, Double.NaN);
        assertNotEquals(result.z, Double.NaN);
    }
}