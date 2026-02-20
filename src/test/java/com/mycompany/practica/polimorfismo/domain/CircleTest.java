package com.mycompany.practica.polimorfismo.domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void testCalculateArea() {
        Circle circle = new Circle(5);
        double expected = Math.PI * 5 * 5;

        assertEquals(expected, circle.calculateArea(), 0.0001);
    }

    @Test
    public void testCalculatePerimeter() {
        Circle circle = new Circle(5);
        double expected = 2 * Math.PI * 5;

        assertEquals(expected, circle.calculatePerimeter(), 0.0001);
    }
}