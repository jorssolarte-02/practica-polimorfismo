package com.mycompany.practica.polimorfismo.domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void testCalculateArea() {
        Square square = new Square(5);
        assertEquals(25, square.calculateArea(), 0.0001);
    }

    @Test
    public void testCalculatePerimeter() {
        Square square = new Square(5);
        assertEquals(20, square.calculatePerimeter(), 0.0001);
    }
}