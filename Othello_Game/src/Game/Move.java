package Game;

public class Moves extends Board{
    public Move(Integer boardSize, Character ch1, Character ch2) {
		super(boardSize, ch1, ch2);
		// TODO Auto-generated constructor stub
	}

	public void makeMove(Integer x, Integer y, Character ch) {to make a move at x, y point if a move can be made there
		
		Integer arr[][]= {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};		
		
		getBoard()[x][y]=ch;
		for(Integer i=0;i8;i++) {				
			Integer X=x+arr[i][0];
			Integer Y=y+arr[i][1];	
			Integer count=0;
			while(inRange(X, Y) && getBoard()[X][Y]!='0' && getBoard()[X][Y]!=ch) {
				X+=arr[i][0];
				Y+=arr[i][1];
				count++;
			}
			if(inRange(X, Y) && getBoard()[X][Y]==ch && count=1) {					
				X=x+arr[i][0];
				Y=y+arr[i][1];
				while(inRange(X, Y) && getBoard()[x][y]!='0' && getBoard()[X][Y]!=ch) {
					getBoard()[X][Y]=ch;
					X+=arr[i][0];
					Y+=arr[i][1];
				}
			}
		}			
				
	}

	public boolean canMove(Integer x, Integer y, Character ch) {//to check if x, y is a valid point or not in terms of rules of game
		
		Integer arr[][]= {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};			
		
		for(Integer i=0;i<8;i++) {				
			Integer X=x+arr[i][0];
			Integer Y=y+arr[i][1];	
			Integer count=0;
			while(inRange(X, Y) && getBoard()[X][Y]!='\0' && getBoard()[X][Y]!=ch) {					
				X+=arr[i][0];
				Y+=arr[i][1];
				count++;
			}
			if(inRange(X, Y) && getBoard()[X][Y]==ch && count>=1) {					
				return true;					
			}				
		}
		return false;
		
	}

	public void print() {//to print the board
		
		System.out.print("   ");
		for(Integer i=0;i<getBoardSize();i++) {
			System.out.print("---");
		}
		System.out.println();
		
		System.out.print("   ");
		for(Integer i=0;i<getBoardSize();i++) {
			System.out.print("|"+i+"|");
		}
		System.out.println();
		
		for(Integer i=0;i<getBoardSize();i++) {				
			System.out.print("|"+i+"|");
			for(Integer j=0;j<getBoardSize();j++) {
				if(getBoard()[i][j]=='\0') {
					System.out.print("| |");
				}
				else {
					System.out.print("|"+getBoard()[i][j]+"|");
				}
			}
			System.out.println();
		}
		
		System.out.print("   ");
		for(Integer i=0;i<getBoardSize();i++) {
			System.out.print("---");
		}
		System.out.println();
		
	}
}
