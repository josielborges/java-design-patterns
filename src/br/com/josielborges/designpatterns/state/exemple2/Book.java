package br.com.josielborges.designpatterns.state.exemple2;

public class Book {

    private BookState bookState = new Avaiable();

    public void setBookState(BookState bookState) {
        this.bookState = bookState;
    }

    public String getStatus() {
        return this.bookState.getStatus();
    }

    public void request() {
        this.bookState.request(this);
    }

    public void giveBack() {
        this.bookState.giveBack(this);
    }

}
