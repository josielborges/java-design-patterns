package br.com.josielborges.designpatterns.flyweight.example1;

import java.util.Arrays;
import java.util.List;

public class FlyweightTest1 {

    public static void main(String[] args) {

        MusicalNotes musicalNotes = new MusicalNotes();

        List<Note> notes = Arrays.asList(musicalNotes.get("Do"),
                musicalNotes.get("Re"),
                musicalNotes.get("Mi"),
                musicalNotes.get("Fa"),
                musicalNotes.get("Fa"),
                musicalNotes.get("Fa"));

        notes.forEach(System.out::println);

    }

}
