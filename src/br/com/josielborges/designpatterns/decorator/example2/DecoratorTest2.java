package br.com.josielborges.designpatterns.decorator.example2;

public class DecoratorTest2 {

    public static void main(String[] args) {

        Window simpleWindow = new SimpleWindow();

        Window windowWithVerticalScrollBar = new VerticalScrollBarDecorator(simpleWindow);
        System.out.println(windowWithVerticalScrollBar.getDescription());

        Window windowWithVerticalAnHorizontalScrollbar = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(simpleWindow));
        System.out.println(windowWithVerticalAnHorizontalScrollbar.getDescription());

    }

}
