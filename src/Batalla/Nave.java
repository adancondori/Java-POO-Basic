package Batalla;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Nave {
    public static void main(String[] args) {
        List<Person> jugadores = new ArrayList<>();
        int impostor = 0;
        int tripulante = 1;
        jugadores.add(new Person("Carlos"));
        jugadores.add(new Person("Franco"));
        jugadores.add(new Person("Lucas"));
        jugadores.add(new Person("Carmen"));
        jugadores.add(new Person("Andres"));
        jugadores.add(new Person("Freddy"));

        int randomInt = new Random().nextInt(jugadores.size());
        jugadores.get(randomInt).setType(impostor);

        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getType() == impostor){
                jugadores.get(i).kill(jugadores);
            }
        }

        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println(jugadores.get(i).toString());
        }
    }
}
