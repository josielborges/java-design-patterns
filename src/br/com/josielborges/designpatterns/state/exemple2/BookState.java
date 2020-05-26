package br.com.josielborges.designpatterns.state.exemple2;

public interface BookState {

    String getStatus();

    void request(Book book);

    void giveBack(Book book);

}
