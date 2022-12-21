package Game;

public class Move extends Board{
    public Move(Integer boardSize, Character ch1, Character ch2) {
		super(boardSize, ch1, ch2);
		// TODO Auto-generated constructor stub
	}

	public void makeMove(Integer x, Integer y, Character ch) {
		
		Integer arr[][]= {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};		
		
		getBoard()[x][y]=ch;
		for(Integer i=0;i<8;i++) {				
			Integer X=x+arr[i][0];
			Integer Y=y+arr[i][1];	
			Integer count=0;
			while(inRange(X, Y) && getBoard()[X][Y]!=null && getBoard()[X][Y]!=ch) {
				X+=arr[i][0];
				Y+=arr[i][1];
				count++;
			}
			if(inRange(X, Y) && getBoard()[X][Y]==ch && count>=1) {					
				X=x+arr[i][0];
				Y=y+arr[i][1];
				while(inRange(X, Y) && getBoard()[x][y]!=null && getBoard()[X][Y]!=ch) {
					getBoard()[X][Y]=ch;
					X+=arr[i][0];
					Y+=arr[i][1];
				}
			}
		}			
				
	}

	public boolean canMove(Integer x, Integer y, Character ch) {
		
		Integer arr[][]= {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};			
		
		for(Integer i=0;i<8;i++) {				
			Integer X=x+arr[i][0];
			Integer Y=y+arr[i][1];	
			Integer count=0;
			while(inRange(X, Y) && getBoard()[X][Y]!=null && getBoard()[X][Y]!=ch) {					
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

	public void print() {
		
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
				if(getBoard()[i][j]==null) {
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

	public boolean isFull() {
		
		for(Integer i=0;i<getBoardSize();i++) {
			for(Integer j=0;j<getBoardSize();j++) {
				if(getBoard()[i][j]==null) {
					return false;
				}
			}
		}
		return true;
		
	}

	public boolean inRange(Integer x, Integer y) {
		
		return (x>=0 && x<getBoardSize() && y>=0 && y<getBoardSize());
		
	}

	public boolean isAvailable(Integer x, Integer y) {
		
		return getBoard()[x][y]==null;
		
	}

	public boolean noMovesAvailable(Character ch) {
		
		for(Integer i=0;i<getBoardSize();i++) {
			for(Integer j=0;j<getBoardSize();j++) {
				if(getBoard()[i][j]==null && canMove(i, j, ch)) {
					return false;
				}
			}
		}
		return true;
		
	}
	public Character getWinner(Character ch1, Character ch2) {

		Integer count1 = 0;
		Integer count2 = 0;
		for (Integer i = 0; i < getBoardSize(); i++) {
			for (Integer j = 0; j < getBoardSize(); j++) {
				if (getBoard()[i][j] == ch1) {
					count1++;
				}
			}
		}
		count2 = ((getBoardSize() * getBoardSize()) - count1);

		System.out.println("player1(" + ch1 + ")'s score is : " + count1);
		System.out.println("player2(" + ch2 + ")'s score is : " + count2);

		if (count1 > count2) {
			return ch1;
		} else if (count1 < count2) {
			return ch2;
		} else {
			return null;
		}

	}

}
