package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch { // Partida de xadrez
	private Board board;

	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() { // Fazendo um downCasting das peças do tipo piece para chessPiece
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumn()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumn(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	public void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		// Esse metodo é responsavel por iniciar a partida de xadrez colocando as peças no tabuleiro.
		placeNewPiece('b',6, new Rook(board, Color.WHITE)); // Colocando uma peça torre
		placeNewPiece('e',8, new King(board, Color.BLACK)); // Colocando uma peça rei
		placeNewPiece('e',1,new King(board, Color.WHITE)); // Colocando uma peça rei
	}
}
