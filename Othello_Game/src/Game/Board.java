package Game;

public class Board extends Game{
	private Character board[][];
		private Integer boardSize;	

		public Board(Integer boardSize, Character ch1, Character ch2) {

			this.boardSize=boardSize;

			board=new Character[boardSize][boardSize];

			Integer index=(boardSize-1)/2;
			board[index][index]=ch2;
			board[index+1][index+1]=ch2;
			board[index][index+1]=ch1;
			board[index+1][index]=ch1;

	}
}
