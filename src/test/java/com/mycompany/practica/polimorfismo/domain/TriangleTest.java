package com.mycompany.practica.polimorfismo.domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void testCalculateArea() {
        Triangle triangle = new Triangle(5, 5);
        assertEquals(12.5, triangle.calculateArea(), 0.0001);
    }

    @Test
    public void testCalculatePerimeter() {
        Triangle triangle = new Triangle(5, 5);

        double hypotenuse = Math.sqrt(5 * 5 + 5 * 5);
        double expected = 5 + 5 + hypotenuse;

        assertEquals(expected, triangle.calculatePerimeter(), 0.0001);
    }
}