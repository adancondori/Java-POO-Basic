package Amoungus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
    public static int TYPE_IMPOSTOR = 0;
    public static int TYPE_TRIPULACION = 1;
    private String color="";
    private String name="";
    private boolean report=false;
    private boolean isKill = false;
    private List<Player> players = new ArrayList<>();
    private List<String> tasks = new ArrayList<>();
    private int type = TYPE_TRIPULACION;

    // CONSTRUCTOR
    public Player(String name) {
        this.name = name;
    }
    // SETTER AND GETTERS
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReport() {
        return report;
    }

    public void setReport(boolean report) {
        this.report = report;
    }

    public boolean isKill() {
        return isKill;
    }

    public void setKill(boolean kill) {
        isKill = kill;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    // METODOS AUXILIARES

    @Override
    public String toString() {
        return "Name: " + this.name + " | " +
                "Tipo: "+ (this.getType() == TYPE_IMPOSTOR ? "Impostor" : "Tripulacion") + " | " +
                "Esta Vivo?: "+ (this.isKill() ? "Muerto" : "Vivo")  + " | " ;
    }

    public void generateKills(List<Player> players) {
        for (int i = 0; i < players.size(); i++) {
            int random = new Random().nextInt(100);
            if (random % 2 == 0 && players.get(i).getType() != TYPE_IMPOSTOR){
                players.get(i).setKill(true);
            }
        }
    }
}
