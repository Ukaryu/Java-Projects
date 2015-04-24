package no.hib.stigespillet;

import SnakesLadders4.Dice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Board board;
        Dice dice = new Dice(1, 6);
        Player[] players;
        int numberOfPlayers;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hei og velkommen til dette stigespillet!");

        //Init players
        String currentPlayerName;
        System.out.print("Antall spillere: ");
        numberOfPlayers = keyboard.nextInt();
        players = new Player[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.print("Spiller " + (i + 1) + " navn: ");
            currentPlayerName = keyboard.next();
            players[i] = new Player(i, 0, currentPlayerName);
        }

        //Init board
        board = new Board();

        //Start the game
        int prevCell;
        int newCell;
        int eyes;
        while (board.active) {

            for (int i = 0; i < numberOfPlayers; i++) {
                eyes = dice.throwDice();
                while ((eyes + players[i].getCell()) > 99) {
                    //Re-throw dice if sum of eyes and current cell surpasses 99
                    eyes = dice.throwDice();
                }

                prevCell = players[i].getCell();
                newCell = board.nextTurn(eyes, players[i]);

                System.out.println("Terning: " + eyes);
                System.out.println(
                        players[i].getName() + " gikk fra " +
                        (prevCell+1) + " til " + (newCell+1)
                );

                if (players[i].getCell() == 99) {
                    //If a player wins
                    board.active = false;
                    System.out.println("Gratulerer " + players[i].getName() + ", du har vunnet!");
                    break;
                }
            }

        }

        System.out.println("The game has ended ;-D");

    }
}
