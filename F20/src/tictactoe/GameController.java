package no.hib.dat100.tictactoe;

public class GameController {

	private char[][] board;
	private char turn;

	// REM: could consider defining an enumeration type for players

	public GameController() {
		turn = TicTacToe.X_PLAYER_CHR; // Player 'X' starts the game
		board = new char[TicTacToe.SIZE][TicTacToe.SIZE];
	}

	public char getTurn() {
		return turn;
	}

	public void nextTurn() {
		switch (turn) {
		case TicTacToe.X_PLAYER_CHR:
			turn = TicTacToe.O_PLAYER_CHR;
			break;
		case TicTacToe.O_PLAYER_CHR:
			turn = TicTacToe.X_PLAYER_CHR;
			break;
		}
	}

	private boolean checkHorizontal(int y, char player) {
		
		
		boolean allequal = true;
		
		// TODO - START
		
		// sjekk bestemt av y
		allequal = false; // fjern denne
		
		// TODO - SLUTT
		
		return allequal;
	}

	private boolean checkVertical(int x, char player) {
		
		boolean allequal = true;
		
		// TODO - START
		
		// sjekk rad gitt ved x
		allequal = false; // fjern denne
		// TODO - SLUTT
		return allequal;
	}

	private boolean checkDiagonals(char player) {
		
		
		boolean allequal_lr = true; // for checking left to right diagonal
		boolean allequal_rl = true; // for checking right to left diagonal
		
		// TODO - START
		
		allequal_lr = false; // fjern denne
		allequal_rl = false; // fjern denne
	
		// TODO - SLUTT
		
		return allequal_lr || allequal_rl;
		
	}

	public boolean checkGameBoardPlayer(char player) {

		boolean gameover = false;

		// check all rows on the board (horizontal)
		int y = 0;
		while (!gameover && y < TicTacToe.SIZE) {

			gameover = checkHorizontal(y, player);
			y++;
		}

		// check all columns on the board (vertical)
		int x = 0;
		while (!gameover && x < TicTacToe.SIZE) {

			gameover = checkVertical(x, player);
			x++;
		}

		if (!gameover) {
			gameover = checkDiagonals(player);
		}

		return gameover;
	}

	// check board given that field (x,y) has been selected by player
	public char checkGameBoard(int x, int y, char player) {
		char winner = ' ';

		System.out.println("Updating Gameboard (" + x + "," + y + ") = "
				+ player);
		board[x][y] = player;

		System.out.println("Checking Gameboard");

		if (checkGameBoardPlayer(TicTacToe.X_PLAYER_CHR)) {
			winner = TicTacToe.X_PLAYER_CHR;
		} else if (checkGameBoardPlayer(TicTacToe.O_PLAYER_CHR)) {
			winner = TicTacToe.O_PLAYER_CHR;
		}

		System.out.println("Winner = " + winner);

		return winner;
	}
}
