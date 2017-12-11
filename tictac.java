//
// creates a tic tac toe game.

public class tictac {
	
	/**
	 * the board height and width is 3.
	 */
	private int dimention = 3;
	
	/**
	 * player array that is the board.
	 */
	private static Player[][] board;
	
	/**
	 * constructor for tictac.
	 */
	public tictac()	{
		
		board = new Player[dimention][dimention];
	}
	
	public boolean setBoardAt(final Player player, final int setX, final int setY)	{
		
		if (board[setX][setY] == null)	{
			board[setX][setY] = player;
			return true;
		}
		return false;
		
		}
	public Player winner(final Player[][] Board) {
		
		//horizontal cases
		if(Board[0][0] == Board[1][0] && Board[0][0] == Board[2][0] && Board[0][0] != null)	{
			return Board[0][0];
		}
		if(Board[0][1] == Board[1][1] && Board[0][1] == Board[2][1] && Board[0][1] != null)	{
			return Board[0][1];
		}
		if(Board[0][2] == Board[1][2] && Board[0][2] == Board[2][2] && Board[0][2] != null)	{
			return Board[0][2];
		}
		//vertical cases
		if(Board[0][0] == Board[0][1] && Board[0][0] == Board[0][2] && Board[0][0] != null)	{
			return Board[0][0];
		}
		if(Board[1][0] == Board[1][1] && Board[1][0] == Board[1][2] && Board[1][0] != null)	{
			return Board[1][0];
		}
		if(Board[2][0] == Board[2][1] && Board[2][0] == Board[2][2] && Board[2][0] != null)	{
			return Board[2][0];
		}
		//diagonal cases
		if(Board[0][0] == Board[1][1] && Board[0][0] == Board[2][2] && Board[0][0] != null)	{
			return Board[0][0];
		}
		if(Board[0][2] == Board[1][1] && Board[0][2] == Board[2][0] && Board[0][2] != null)	{
			return Board[0][2];
		}
		return null;
	}
	public boolean tie(final Player[][] Board)	{
		if(winner(Board) == null)	{
			for (int i = 0; i < dimention; i++) {
				for (int j = 0; j < dimention; j++) {
					if(Board[i][j] == null)	{
						return false;
					}
				}
			} 

		}
		return true;
	}
}
