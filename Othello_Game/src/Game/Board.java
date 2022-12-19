package othello;
	public class Board{
		
		
		private char board[][];
		private Integer boardSize;
		
		public Board(Integer boardSize, Character ch1, Character ch2) {
			
			this.boardSize=boardSize;
			
			board=new char[boardSize][boardSize];
			
			Integer index=(boardSize-1)/2;
			board[index][index]=ch2;
			board[index+1][index+1]=ch2;
			board[index][index+1]=ch1;
			board[index+1][index]=ch1;
					
		}
		
		

		
			
			
			public char[][] getBoard() {
				return board;
			}

			public void setBoard(char board[][]) {
				this.board = board;
			}

			public int getBoardSize() {
				return boardSize;
			}

			public void setBoardSize(int boardSize) {
				this.boardSize = boardSize;
			}
			

	
	}