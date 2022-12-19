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

		public Character getWinner(Character ch1, Character ch2) {
				
		    Integer count1=0;
		    Integer count2=0;
		    for(Integer i=0;i<getBoardSize();i++) {
		        for(Integer j=0;j<getBoardSize();j++) {
		            if(getBoard()[i][j]==ch1) {
		                count1++;
		            }
		        }
		    }
		    count2=((getBoardSize()*getBoardSize())-count1);
    
		    System.out.println("player1("+ch1+")'s score is : "+count1);
		    System.out.println("player2("+ch2+")'s score is : "+count2);
    
		    if(count1>count2) {
		        return ch1;
		    }
		    else if(count1<count2) {
		        return ch2;
		    }
		    else {
		        return '\0';
		    }
	    
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