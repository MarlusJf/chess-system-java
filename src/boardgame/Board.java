package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;

	public Board(int rows, int column) { // Tabuleiro
		if (rows < 1 || column < 1) {
			throw new BoardException(
					"Erros criando tabuleiro. � necess�rio que hava pelo menos uma linha e uma coluna");
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

	public Piece piece(int row, int column) { // retorna a pe�� da posi��o passada no parametro
		if (!positionExists(row, column)) {
			throw new BoardException("Posi��o n�o existe.");
		}
		return pieces[row][column];
	}

	public Piece piece(Position position) { // retorna a pe�� da posi��o passada no parametro
		if (!positionExists(position)) {
			throw new BoardException("Posi��o n�o existe.");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) { // Met�do para colocar a pe�a
		// Esse metodo vai na matriz e vai colocar a pe�a na posi��o indicada
		if (thereIsAPiece(position)) {
			throw new BoardException("j� existe uma pe�a nessa posi��o: " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	private boolean positionExists(int row, int column) { // metodo auxiliar ao metodo seguinte positionExists(Position
															// position).
		return row >= 0 && row < rows && column >= 0 && column < columns; // se essa condi��o for verdadeiro ele retorna
																			// true.
	}

	public boolean positionExists(Position position) {
		// Esse metodo � responsavel por verificar se a posi��o passada no parametro
		// realmente existe.
		return positionExists(position.getRow(), position.getColumn());
	}

	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posi��o n�o existe.");
		}
		// Vou chamar o metodo piece para averiguar se o reultado � nulo ou n�o.
		return piece(position) != null; // se ele for diferente de nulo � pq j� tem uma pe�a na posi��o.

	}

}
