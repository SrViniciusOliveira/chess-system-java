package boardgame;

public class Piece {
	
	
	protected Position position;
	private Board board;

	//Constructor
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	protected Board getBoard() { //Somente classes dentro do mesmo pacote e subclasses de peças podem acessar
		return board;
	}
	
}
