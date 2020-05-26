package br.com.josielborges.designpatterns.state.exemple2;

public class Unavaiable implements BookState {

    @Override
    public String getStatus() {
        return "The book is unavaiable";
    }

    @Override
    public void request(Book book) {
        throw new RuntimeException("The book is unavaiable");
    }

    @Override
    public void giveBack(Book book) {
        System.out.println("Book returned");
        book.setBookState(new Avaiable());
    }
}
