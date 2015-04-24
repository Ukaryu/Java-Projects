package no.hib.stigespillet;

import java.util.Random;

/**
 * @author Nataniel Pedersen
 */
public class Board {
    private int[] map = new int[100];
    boolean active;

    public Board() {
        for (int i = 0; i < map.length; i++)
            map[i] = -1;

        //Ladders: from - to
        map[1] = 37;
        map[3] = 13;
        map[7] = 30;
        map[20] = 41;
        map[27] = 83;
        map[35] = 43;
        map[50] = 66;
        map[70] = 90;
        map[79] = 99;

        //Snakes: from - to
        map[97] = 77;
        map[94] = 74;
        map[91] = 72;
        map[86] = 23;
        map[63] = 59;
        map[61] = 17;
        map[55] = 52;
        map[48] = 10;
        map[46] = 25;
        map[15] = 5;

        active = true;
    }

    /**
     * Move a player
     * @param eyes number of cells to increment
     * @param player the player to move
     * @return the resulting cell
     */
    public int nextTurn(int eyes, Player player) {
        int cellIndex;
        int cellValue;

        player.incrementCell(eyes);

        //Check if stepped on a ladder/snake
        cellIndex = player.getCell();
        cellValue = map[cellIndex];
        if (cellValue > 0 && cellIndex < cellValue) {
            //This is a ladder
            if (cellIndex < cellValue) player.setCell(cellValue);
        } else if (cellValue > 0 && cellIndex > cellValue) {
            //This is a snake
            if (cellIndex > cellValue) player.setCell(cellValue);
        }

        return player.getCell();
    }

}
