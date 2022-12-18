package othello;
	public class Board{
		
//		this is the Board class to handle the board related part of the game 
		
		private char board[][];//this is the board on which the game is to be played
		private Integer boardSize;//this is the size of that square board	
		
		public Board(Integer boardSize, Character ch1, Character ch2) {
			
			this.boardSize=boardSize;//set the board size to the given value
			
			board=new char[boardSize][boardSize];//make a board of that size
			
			Integer index=(boardSize-1)/2;//setting the initial arrangement of the board
			board[index][index]=ch2;
			board[index+1][index+1]=ch2;
			board[index][index+1]=ch1;
			board[index+1][index]=ch1;
					
		}
		
		public boolean isFull() {//checking whether board is full or not
			
			for(Integer i=0;i<boardSize;i++) {
				for(Integer j=0;j<boardSize;j++) {
					if(board[i][j]=='\0') {
						return false;
					}
				}
			}
			return true;
			
		}
		
		public boolean inRange(Integer x, Integer y) {//to check if x, y point is within board range or not
			
			return (x>=0 && x<boardSize && y>=0 && y<boardSize);
			
		}

		public void print() {//to print the board
			
			System.out.print("   ");
			for(Integer i=0;i<boardSize;i++) {
				System.out.print("---");
			}
			System.out.println();
			
			System.out.print("   ");
			for(Integer i=0;i<boardSize;i++) {
				System.out.print("|"+i+"|");
			}
			System.out.println();
			
			for(Integer i=0;i<boardSize;i++) {				
				System.out.print("|"+i+"|");
				for(Integer j=0;j<boardSize;j++) {
					if(board[i][j]=='\0') {
						System.out.print("| |");
					}
					else {
						System.out.print("|"+board[i][j]+"|");
					}
				}
				System.out.println();
			}
			
			System.out.print("   ");
			for(Integer i=0;i<boardSize;i++) {
				System.out.print("---");
			}
			System.out.println();
			
		}
	
	}