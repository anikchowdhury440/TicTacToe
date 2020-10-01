public class TicTacToeGame
{
	public char[] createBoard()
	{
		char[] board = new char[10];
		for(int index = 0; index < board.length; index++)
		{
			board[index]=' ';
		}
		return board;
	}
	public static void main(String[] args)
	{
		TicTacToeGame tictactoe = new TicTacToeGame();
		tictactoe.createBoard();
	}
}
