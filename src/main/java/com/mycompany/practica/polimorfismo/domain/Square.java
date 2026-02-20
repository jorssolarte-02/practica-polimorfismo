/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica.polimorfismo.domain;

/**
 *
 * @author JORS SOLARTE
 */
public class Square extends Figure {
    public Square(double side) {
        this.x = side;
    }

    @Override
    public double calculateArea() {
        return x*x;
    }

    @Override
    public double calculatePerimeter() {
        return 4*x;
    }
}
