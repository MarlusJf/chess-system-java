package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{ // Rook = Torre

	public Rook(Board board, Color color) {
		super(board, color);
		
	} 
	
	@Override
	public String toString() {
		return "R"; // Essa string 'R' vai aparecer no tabuleiro onde tiver a peça torre.
	}

}
