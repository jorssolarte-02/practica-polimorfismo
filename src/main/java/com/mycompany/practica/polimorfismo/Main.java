

package com.mycompany.practica.polimorfismo;

import com.mycompany.practica.polimorfismo.domain.Circle;
import com.mycompany.practica.polimorfismo.domain.Figure;
import com.mycompany.practica.polimorfismo.domain.Square;
import com.mycompany.practica.polimorfismo.domain.Triangle;

/**
 *
 * @author JORS SOLARTE
 */
public class Main {

    public static void main(String[] args) {
        Figure circule = new Circle(5);
        Figure square = new Square(5);
        Figure triangle = new Triangle(5,5);
        
        // Circle
        System.out.println("The area of the circle is: " + circule.calculateArea());
        System.out.println("The perimeter of the circle is: " + circule.calculatePerimeter());
        
        // Square
        System.out.println("The area of the square is: " + square.calculateArea());
        System.out.println("The perimeter of the square is: " + square.calculatePerimeter());
        
        // Triangle
        System.out.println("The area of the triangle is: " + triangle.calculateArea());
        System.out.println("The perimeter of the triangle is: " + triangle.calculatePerimeter());
    }
}

