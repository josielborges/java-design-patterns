package br.com.josielborges.designpatterns.factory.example2;

public class ShapeFactory {

    public Shape getShape(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("square")) {
            return new Square();
        }
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }

}
