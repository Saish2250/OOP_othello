package Game;
public class Board extends Game {

	//private ArrayList <ArrayList<Character>> bo = new ArrayList<ArrayList<Character>>();
	private Character board[][];
	private Integer boardSize;

	public Board(Integer boardSize, Character ch1, Character ch2) {

		this.setBoardSize(boardSize);

		setBoard(new Character[boardSize][boardSize]);

		Integer index = (boardSize - 1) / 2;
		getBoard()[index][index] = ch2;
		getBoard()[index + 1][index + 1] = ch2;
		getBoard()[index][index + 1] = ch1;
		getBoard()[index + 1][index] = ch1;

	}

	
	
	public Character[][] getBoard() {
		return board;
	}

	public void setBoard(Character[][] board) {
		this.board = board;
	}

	public Integer getBoardSize() {
		return boardSize;
	}

	public void setBoardSize(Integer boardSize) {
		this.boardSize = boardSize;
	}

}
