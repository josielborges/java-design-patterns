package br.com.josielborges.designpatterns.state.exemple2;

public class StateTest2 {

    public static void main(String[] args) {
        Book book = new Book();
        book.request();
        book.giveBack();

        System.out.println(book.getStatus());

        book.request();

        System.out.println(book.getStatus());
    }
}
