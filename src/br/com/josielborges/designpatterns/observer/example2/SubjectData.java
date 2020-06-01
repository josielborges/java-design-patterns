package br.com.josielborges.designpatterns.observer.example2;

public class SubjectData extends Subject {

    private String data = "Subject";

    public void setData(String data) {
        this.data = data;
        execute();
    }

    public String getData() {
        return data;
    }
}
