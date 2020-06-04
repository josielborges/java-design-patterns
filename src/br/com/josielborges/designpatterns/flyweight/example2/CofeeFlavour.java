package br.com.josielborges.designpatterns.flyweight.example2;

import java.util.Map;
import java.util.WeakHashMap;

public class CofeeFlavour {

    private final String name;

    private static final Map<String, CofeeFlavour> FLAVOURS = new WeakHashMap<>();

    private CofeeFlavour(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static CofeeFlavour intern (String name){
        synchronized (FLAVOURS) {
            return FLAVOURS.computeIfAbsent(name, CofeeFlavour::new);
        }
    }

    public static int flavoursSize(){
        synchronized (FLAVOURS) {
            return FLAVOURS.size();
        }
    }

}
