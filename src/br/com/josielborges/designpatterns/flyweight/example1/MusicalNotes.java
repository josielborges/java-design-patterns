package br.com.josielborges.designpatterns.flyweight.example1;

import java.util.HashMap;
import java.util.Map;

public class MusicalNotes {

    private static Map<String, Note> notes = new HashMap<>();

    static {
        notes.put("Do", new Do());
        notes.put("Re", new Re());
        notes.put("Mi", new Mi());
        notes.put("Fa", new Fa());
        notes.put("Sol", new Sol());
        notes.put("La", new La());
        notes.put("Si", new Si());
    }

    public Note get(String noteName) {
        return notes.get(noteName);
    }

}
