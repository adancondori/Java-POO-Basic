package Batalla;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Person {
    private String name = "";
    private int type = 1; // 1 es tripulante y si es 0 impostor
    private List<Person> killes  = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String killers = "";
        for (int i = 0; i < killes.size(); i++) {
            killers += killes.get(i).getName() + ", ";
        }
        return "Name: " + name + " " +
                "type: " + (type == 1 ? "Tripulantes" : "Impostor") +
                " Muertes: " + killers;
    }

    public void  kill(List<Person> jugadores){
        for (int i = 0; i < jugadores.size() ; i++) {
            int randomInt = new Random().nextInt(100);
            if (randomInt % 2 == 0){
                killes.add(jugadores.get(i));
            }
        }
    }
}
