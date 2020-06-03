package br.com.josielborges.designpatterns.factory.example2;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
