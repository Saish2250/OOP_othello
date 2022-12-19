package othello;

public class Board extends Othello {

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
			return '\0';
		}

	}

	
	public Character[][] getBoard() {
		return board;
	}

	public void setBoard(Character[][] characters) {
		this.board = characters;
	}

	public Integer getBoardSize() {
		return boardSize;
	}

	public void setBoardSize(Integer boardSize) {
		this.boardSize = boardSize;
	}

}
