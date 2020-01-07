package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{ // Pe�a do rei

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K"; // Essa string 'K' vai aparecer no tabuleiro onde tiver a pe�a rei.
	}

}
