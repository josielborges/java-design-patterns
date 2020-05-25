package br.com.josielborges.designpatterns.decorator.example2;

public abstract class WindowDecorator implements Window {

    private Window windowToBeDecorated;

    public WindowDecorator(Window windowToBeDecorated) {
        this.windowToBeDecorated = windowToBeDecorated;
    }

    @Override
    public void draw() {
        windowToBeDecorated.draw(); //Delegation
    }

    @Override
    public String getDescription() {
        return windowToBeDecorated.getDescription(); //Delegation
    }
}
