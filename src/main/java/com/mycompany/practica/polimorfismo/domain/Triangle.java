/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica.polimorfismo.domain;

/**
 *
 * @author JORS SOLARTE
 */
public class Triangle extends Figure {
    public Triangle(double base, double height) {
        this.x = base;
        this.y = height;
    }

    @Override
    public double calculateArea() {
        return (x*y)/2;
    }

    @Override
    public double calculatePerimeter() {
        double h = Math.sqrt(x * x + y * y);
        
        return x + y + h; 
    }
}
