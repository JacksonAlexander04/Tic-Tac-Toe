import java.util.Scanner;

public class ticTacToe {
	private static String[][] board = new String[3][3];
	private static Scanner scanner = new Scanner(System.in);
	private static String playerSide = "X";
	static String computerSide = "O";
	static int randomNumberRow;
	static int randomNumberCol;

	public static void main(String[] args) {
		prepareBoard();
		displayBoard();
		userXorOChoice();
		for(int i = 0; i < 4; i++) {
		playerTurns();
		displayBoard();
		checkForWin();
		ComputerTurn();
		displayBoard();
		checkForWin();
		}
		playerTurns();
		displayBoard();
		System.out.println("You tied with the computer.");
		
		
	}

	public static void prepareBoard() {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				board[row][col] = " ";
			}
		}
	}

	public static void displayBoard() {
		System.out.println("     1     2     3   ");
		System.out.println("  -------------------");
		System.out.println("A |  " + board[0][0] + "  |  " + board[0][1] + "  |  " + board[0][2] + "  |");
		System.out.println("  -------------------");
		System.out.println("B |  " + board[1][0] + "  |  " + board[1][1] + "  |  " + board[1][2] + "  |");
		System.out.println("  -------------------");
		System.out.println("C |  " + board[2][0] + "  |  " + board[2][1] + "  |  " + board[2][2] + "  |");
		System.out.println("  -------------------");

	}

	public static void userXorOChoice() {
		System.out.println("Would you like to be X's or O's? Enter 1 for X's and 2 for O's");
		int XorOChoice = scanner.nextInt();
		if (XorOChoice == 1) {
			System.out.println("You are X's and get to go first.");
			

		} else {
			System.out.println("Your are O's and the computer goes first");
			playerSide = "O";
			computerSide = "X";
			board[randomNumberRow][randomNumberCol] = "X";
			displayBoard();
		}
	}

	public static void playerTurns() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a space");
		String playerTurn = scanner.nextLine();

		if (playerTurn.equals("A1") || playerTurn.equals("a1") ) {
			if(board[0][0].equals(" ")) {

			board[0][0] = playerSide;
			}

		}
		else if(playerTurn.equals("A2") || playerTurn.equals("a2") ) {
			if(board[0][1].equals(" ")) {

			board[0][1] = playerSide;
			}

		}
		else if(playerTurn.equals("A3") || playerTurn.equals("a3") ) {
			if(board[0][2].equals(" ")) {

			board[0][2] = playerSide;
			}

		}
		else if(playerTurn.equals("B1") || playerTurn.equals("b1") ) {
			if(board[1][0].equals(" ")) {

			board[1][0] = playerSide;
			}

		}
		else if(playerTurn.equals("B2") || playerTurn.equals("b2") ) {
			if(board[1][1].equals(" ")) {

			board[1][1] = playerSide;
			}

		}
		else if(playerTurn.equals("B3") || playerTurn.equals("b3") ) {
			if(board[1][2].equals(" ")) {

			board[1][2] = playerSide;
			}

		}
		else if(playerTurn.equals("C1") || playerTurn.equals("c1") ) {
			if(board[2][0].equals(" ")) {

			board[2][0] = playerSide;
			}

		}
		else if(playerTurn.equals("C2") || playerTurn.equals("c2") ) {
			if(board[2][1].equals(" ")) {

			board[2][1] = playerSide;
			}

		}
		else if(playerTurn.equals("C3") || playerTurn.equals("c3") ) {
			if(board[2][2].equals(" ")) {

			board[2][2] = playerSide;
			}

		}
		else {
			playerTurns();
		}
	}


	public static void ComputerTurn() {

		randomNumberRow = (int) (Math.random() * 3 );
		randomNumberCol = (int) (Math.random() * 3 );
		if(board[randomNumberRow][randomNumberCol].equals(" ")) {
		board[randomNumberRow][randomNumberCol] = computerSide;
		
		}
		else {
			ComputerTurn();
		}
		
		
	}
	public static void checkForWin() {
		if(board[0][0].equals(playerSide) && board[0][1].equals(playerSide) && board[0][2].equals(playerSide)) {
			System.out.println("You win!");
			System.exit(0);
		}
		else if(board[1][0].equals(playerSide) && board[1][1].equals(playerSide) && board[1][2].equals(playerSide)) {
			System.out.println("You win!");
			System.exit(0);
		}
		else if(board[2][0].equals(playerSide) && board[2][1].equals(playerSide) && board[2][2].equals(playerSide)) {
			System.out.println("You win!");
			System.exit(0);
		}
		else if(board[0][0].equals(playerSide) && board[1][0].equals(playerSide) && board[2][0].equals(playerSide)) {
			System.out.println("You win!");
			System.exit(0);
		}
		else if(board[0][1].equals(playerSide) && board[1][1].equals(playerSide) && board[2][1].equals(playerSide)) {
			System.out.println("You win!");
			System.exit(0);
		}
		else if(board[0][2].equals(playerSide) && board[1][2].equals(playerSide) && board[2][2].equals(playerSide)) {
			System.out.println("You win!");
			System.exit(0);
		}
		else if(board[0][0].equals(playerSide) && board[1][1].equals(playerSide) && board[2][2].equals(playerSide)) {
			System.out.println("You win!");
			System.exit(0);
		}
		else if(board[0][2].equals(playerSide) && board[1][1].equals(playerSide) && board[2][0].equals(playerSide)) {
			System.out.println("You win!");
			System.exit(0);
		}
		else if(board[0][0].equals(computerSide) && board[1][1].equals(computerSide) && board[2][2].equals(computerSide)) {
			System.out.println("You lose!");
			System.exit(0);
		}
		else if(board[0][2].equals(computerSide) && board[1][1].equals(computerSide) && board[2][0].equals(computerSide)) {
			System.out.println("You lose!");
			System.exit(0);
		}
		else if(board[0][0].equals(computerSide) && board[1][0].equals(computerSide) && board[2][0].equals(computerSide)) {
			System.out.println("You lose!");
			System.exit(0);
		}
		else if(board[0][1].equals(computerSide) && board[1][1].equals(computerSide) && board[2][1].equals(computerSide)) {
			System.out.println("You lose!");
			System.exit(0);
		}
		else if(board[0][2].equals(computerSide) && board[1][2].equals(computerSide) && board[2][2].equals(computerSide)) {
			System.out.println("You lose!");
			System.exit(0);
		}
		else if(board[0][0].equals(computerSide) && board[0][1].equals(computerSide) && board[0][2].equals(computerSide)) {
			System.out.println("You lose!");
			System.exit(0);
		}
		else if(board[1][0].equals(computerSide) && board[1][1].equals(computerSide) && board[1][2].equals(computerSide)) {
			System.out.println("You lose!");
			System.exit(0);
		}
		else if(board[2][0].equals(computerSide) && board[2][1].equals(computerSide) && board[2][2].equals(computerSide)) {
			System.out.println("You lose!");
			System.exit(0);
		}
		else if(board[0][0].equals(computerSide) && board[1][0].equals(computerSide) && board[2][0].equals(computerSide)) {
			System.out.println("You lose!");
			System.exit(0);
		}
		
		
	}
		
	}
		
	
