package chess;

import boardgame.Position;

public class ChessPosition { // Posição da peça no xadrez
	private char column;
	private int row;

	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating chessPosition. Valid value are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	protected Position toPosition() {
		// Esse metodo vai transformar a posição do xadrez para a posição da matrix, ou
		// seja, a posição do tabuleiro.
		return new Position(8 - row, column - 'a');
		// eu vou diminuir o valor da linha - 8, para poder saber o valor da martix. a
		// linha 8 - 8 da a posição 0 na matrix.
	}

	protected static ChessPosition fromPosition(Position position) {
		// Agora vou converter a posição da matriz em posição no xadrez.
		// Esse metodo recebe uma posição como argumento, e trasforma em posição do
		// xadrez.
		return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());
	}

	@Override
	public String toString() {
		return "" + column + row;
	}

}
