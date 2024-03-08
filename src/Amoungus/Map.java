package Amoungus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Map {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Lucas"));
        players.add(new Player("Andre"));
        players.add(new Player("Franco"));
        players.add(new Player("Ariel"));
        players.add(new Player("Orlando"));
        players.add(new Player("Carmen"));
        players.add(new Player("Carlos"));
        players.add(new Player("Freddy"));

        int random = new Random().nextInt(players.size());
        players.get(random).setType(Player.TYPE_IMPOSTOR);

        generateKills(players);

        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i).toString());
        }
    }

    public static void generateKills(List<Player> players){
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getType() == Player.TYPE_IMPOSTOR) {
                players.get(i).generateKills(players);
            }
        }
    }
}
