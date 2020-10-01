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
	
	//UC3
	public void showBoard(char[] board)
        {
                for(int index = 1; index < board.length; index++)
                {
                        System.out.print(board[index]);
                        if(index%3 == 0)
                        {
                                System.out.println(" ");
                                if(index != 9)
                                        System.out.println("_ _ _");
                        }
                        else
                        {
                                System.out.print("|");
                        }
                }
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
		tictactoe.showBoard(board);
	}
}
