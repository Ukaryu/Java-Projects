package no.hib.stigespillet;

/**
 * @author Nataniel Pedersen
 */
public class Player {
    private int id;
    private int cell;
    private String name;

    public Player(int id, int cell, String name) {
        this.id = id;
        this.cell = cell;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void incrementCell(int increment) {
        this.cell += increment;
    }
}
