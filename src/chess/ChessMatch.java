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

	public ChessPiece[][] getPieces() { // Fazendo um downCasting das pe�as do tipo piece para chessPiece
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumn()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumn(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void initialSetup() {
		// Esse metodo � responsavel por iniciar a partida de xadrez colocando as pe�as no tabuleiro.
		board.placePiece(new Rook(board, Color.WHITE), new Position(2,1)); // Colocando uma pe�a torre
		board.placePiece(new King(board, Color.BLACK), new Position(0,4)); // Colocando uma pe�a rei
		board.placePiece(new King(board, Color.WHITE), new Position(7,4)); // Colocando uma pe�a rei
	}
}
