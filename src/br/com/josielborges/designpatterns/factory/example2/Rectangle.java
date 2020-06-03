package br.com.josielborges.designpatterns.factory.example2;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
