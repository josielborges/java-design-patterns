package br.com.josielborges.designpatterns.observer.example2;

public class ObserverTest2 {

    public static void main(String[] args) {

        SubjectData subjectData = new SubjectData();

        subjectData.addObserver(new ConcreteObserverA());
        subjectData.addObserver(new ConcreteObserverB());

        subjectData.setData("Data 1");

        subjectData.setData("Data 2");

    }

}
