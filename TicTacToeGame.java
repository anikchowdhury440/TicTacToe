import java.util.Scanner;
public class TicTacToeGame
{
	//uc1
	public char[] createBoard()
	{
		char[] board = new char[10];
		for(int index = 0; index < board.length; index++)
		{
			board[index]=' ';
		}
		return board;
	}

	//Uc2
	public char chooseInput(Scanner userInput)
	{
		System.out.println("Enter Your choice:(X or o) ");
		return userInput.next().toUpperCase().charAt(0);
	}

	public static void main(String[] args)
	{
		char computerletter;
		TicTacToeGame tictactoe = new TicTacToeGame();
		char [] board = tictactoe.createBoard();
		Scanner userinput = new Scanner(System.in);
		char userletter = tictactoe.chooseInput(userinput);
		if ( userletter == 'X' )
		{
			computerletter = 'O';
		}
		else
		{
			computerletter = 'X' ;
		}
	}
}
