package Amoungus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Map {
    public static int TYPE_IMPOSTOR = 0;
    public static int TYPE_TRIPULANTE = 1;
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Franco",TYPE_TRIPULANTE));
        players.add(new Player("Sara",TYPE_TRIPULANTE));
        players.add(new Player("Sergio",TYPE_TRIPULANTE));
        players.add(new Player("Matias",TYPE_TRIPULANTE));
        players.add(new Player("Pedro",TYPE_TRIPULANTE));
        players.add(new Player("Lucas",TYPE_TRIPULANTE));
        players.add(new Player("Isabel",TYPE_TRIPULANTE));
        players.add(new Player("Andre",TYPE_TRIPULANTE));
        int random = new Random().nextInt(players.size());
        players.get(random).setType(TYPE_IMPOSTOR);

        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i).toString());
        }
    }
}
