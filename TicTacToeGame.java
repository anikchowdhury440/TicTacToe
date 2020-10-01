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
	public char getComputerLetter(char userLetter)
	{
		char computerLetter;
		if ( userLetter == 'X' )
                {
                        computerLetter = 'O';
                }
                else
                {
                        computerLetter = 'X' ;
                }
		return computerLetter;
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

	//UC4
	public int chooseIndex(Scanner userInput)
	{
		int indexcheck = 0;
		int index = 0;
		while(indexcheck == 0)
		{
			System.out.println("Enter the index(1-9): ");
	        	index = userInput.nextInt();
			if(index >= 1 && index <= 9)
			{
				indexcheck = 1;
			}
			else
			{
				System.out.println("You didn't entered valid index. Please select valid index");
			}
		}
		return index;
	}

	public int checkSpace(int index, char[] board)
        {
                int check = 0;
                if( board[index] == ' ')
                {
                        check = 1;
                }
                else
                {
                        System.out.println("Location is filled already");
                }
                return check;
        }

	public static void main(String[] args)
	{
		int checkLocation = 0,index = 0 ;
		TicTacToeGame tictactoe = new TicTacToeGame();
		char [] board = tictactoe.createBoard();
		Scanner userinput = new Scanner(System.in);
		char userLetter = tictactoe.chooseInput(userinput);
		char computerLetter = tictactoe.getComputerLetter(userLetter);
		tictactoe.showBoard(board);
		while(checkLocation == 0)
                {
                        index = tictactoe.chooseIndex(userinput);
                        checkLocation = tictactoe.checkSpace(index,board);
                }
                board[index]=userLetter;
                tictactoe.showBoard(board);
	}
}
