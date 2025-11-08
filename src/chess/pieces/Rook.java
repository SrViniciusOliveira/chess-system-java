package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) { //Tabuleiro, cor da peça e etc...
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "R";
		
	}


	
}
