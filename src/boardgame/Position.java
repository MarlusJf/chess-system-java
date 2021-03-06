package boardgame;

public class Position { // Posi��o da pe�a no tabuleiro
	private int column;
	private int row;

	public Position() {
	}

	public Position(int row, int column) {
		this.column = column;
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public void setValues(int column, int row) {
		this.column = column;
		this.row = row;
	}

	@Override
	public String toString() {
		return row + ", " + column;
	}
}
