package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;

	public Board(int rows, int column) { // Tabuleiro
		if (rows < 1 || column < 1) {
			throw new BoardException(
					"Erros criando tabuleiro. É necessário que hava pelo menos uma linha e uma coluna");
		}
		this.rows = rows;
		this.columns = column;
		pieces = new Piece[rows][column];
	}

	public int getRows() {
		return rows;
	}

	public int getColumn() {
		return columns;
	}

	public Piece piece(int row, int column) { // retorna a peçã da posição passada no parametro
		if (!positionExists(row, column)) {
			throw new BoardException("Posição não existe.");
		}
		return pieces[row][column];
	}

	public Piece piece(Position position) { // retorna a peçã da posição passada no parametro
		if (!positionExists(position)) {
			throw new BoardException("Posição não existe.");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) { // Metódo para colocar a peça
		// Esse metodo vai na matriz e vai colocar a peça na posição indicada
		if (thereIsAPiece(position)) {
			throw new BoardException("jà existe uma peça nessa posição: " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	private boolean positionExists(int row, int column) { // metodo auxiliar ao metodo seguinte positionExists(Position
															// position).
		return row >= 0 && row < rows && column >= 0 && column < columns; // se essa condição for verdadeiro ele retorna
																			// true.
	}

	public boolean positionExists(Position position) {
		// Esse metodo é responsavel por verificar se a posição passada no parametro
		// realmente existe.
		return positionExists(position.getRow(), position.getColumn());
	}

	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posição não existe.");
		}
		// Vou chamar o metodo piece para averiguar se o reultado é nulo ou não.
		return piece(position) != null; // se ele for diferente de nulo é pq já tem uma peça na posição.

	}

}
