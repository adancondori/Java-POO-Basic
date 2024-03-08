package Amoungus;

public class Player {
    private String name = "";
    private String color = "";
    private boolean report = false;
    private int type = 1; // 1 = tripulante / 0 = impostor

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
                + " Tipo: " + (type == 1 ? "Tripulante" : "Impostor" + " ");
    }
}
