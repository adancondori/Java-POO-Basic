package Amoungus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
    private String name = "";
    private String color = "";
    private boolean report = false;
    private int type = 1; // 1 = tripulante / 0 = impostor
    private boolean isKill = false;
    private List<Player> kills = new ArrayList<>();

    public List<Player> getKills() {
        return kills;
    }

    public void setKills(List<Player> kills) {
        this.kills = kills;
    }

    public boolean isKill() {
        return isKill;
    }

    public void setKill(boolean kill) {
        isKill = kill;
    }

    public Player(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isReport() {
        return report;
    }

    public void setReport(boolean report) {
        this.report = report;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " "
                    + " Tipo: " + (type == 1 ? "Tripulante" : "Impostor" + " ") +
                    "Is Kill: " + (this.isKill ? "SI" : "NO");
    }

    public void killsGenerate(List<Player> players) {
        for (int i = 0; i < players.size(); i++) {
            int random = new Random().nextInt(100);
            if (random % 2 == 0 && Map.TYPE_IMPOSTOR != players.get(i).getType()){
                players.get(i).setKill(true);
                this.kills.add(players.get(i));
            }
        }
    }
}
