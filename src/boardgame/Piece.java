package boardgame;

public class Piece { // Pe�a generica
	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}

}
