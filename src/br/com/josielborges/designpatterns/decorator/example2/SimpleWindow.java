package br.com.josielborges.designpatterns.decorator.example2;

public class SimpleWindow implements Window {

    @Override
    public void draw() {
        // Draw the widow
    }

    @Override
    public String getDescription() {
        return "Simple Window";
    }
}
