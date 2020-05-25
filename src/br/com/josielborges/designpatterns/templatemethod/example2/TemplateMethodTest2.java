package br.com.josielborges.designpatterns.templatemethod.example2;

public class TemplateMethodTest2 {

    public static void main(String[] args) {

        Game mario = new Mario();
        mario.play();

        Game sonic = new Sonic();
        sonic.play();

    }

}
