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
		
		public boolean isFull() {
			
			for(Integer i=0;i<boardSize;i++) {
				for(Integer j=0;j<boardSize;j++) {
					if(board[i][j]=='\0') {
						return false;
					}
				}
			}
			return true;
			
		}
		
		public boolean inRange(Integer x, Integer y) {
			
			return (x>=0 && x<boardSize && y>=0 && y<boardSize);
			
		}

		public void print() {
			
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