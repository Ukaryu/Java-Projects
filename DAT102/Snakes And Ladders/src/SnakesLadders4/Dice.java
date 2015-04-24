package SnakesLadders4;

import java.util.Random;

/**
 * @author Nataniel Pedersen
 */
public class Dice {
    Random r = new Random();
    int low;
    int high;

    public Dice(int low, int high) {
        this.low = low;
        this.high = high+1;
    }

    /**
     * Throw the dice.
     * @return a random number from 'low' to 'high'
     */
    public int throwDice() {
        return r.nextInt(high-low) + low;
    }
}
