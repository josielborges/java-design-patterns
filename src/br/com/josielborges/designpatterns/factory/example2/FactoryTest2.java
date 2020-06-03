package br.com.josielborges.designpatterns.factory.example2;

public class FactoryTest2 {

    public static void main(String[] args) {

        Shape circle = new ShapeFactory().getShape("circle");
        circle.draw();

        Shape square = new ShapeFactory().getShape("square");
        square.draw();

    }
}
