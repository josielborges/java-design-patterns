package br.com.josielborges.designpatterns.state.exemple2;

public class Avaiable implements BookState {

    @Override
    public String getStatus() {
        return "The book is avaiable";
    }

    @Override
    public void request(Book book) {
        System.out.println("Book requested");
        book.setBookState(new Unavaiable());
    }

    @Override
    public void giveBack(Book book) {
        throw new RuntimeException("The book is already in library");
    }
}
