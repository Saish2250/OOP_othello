package othello;
	public class Board{
		
//		this is the Board class to handle the board related part of the game 
		
		private char board[][];//this is the board on which the game is to be played
		private int boardSize;//this is the size of that square board	
		
		public Board(Integer boardSize, Character ch1, Character ch2) {
			
			this.boardSize=boardSize;//set the board size to the given value
			
			board=new char[boardSize][boardSize];//make a board of that size
			
			Integer  index=(boardSize-1)/2;//setting the initial arrangement of the board
			board[index][index]=ch2;
			board[index+1][index+1]=ch2;
			board[index][index+1]=ch1;
			board[index+1][index]=ch1;
					
		}	
	}