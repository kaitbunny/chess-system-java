package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	//constructors
	public Piece() {
	}
	
	public Piece(Board board) {
		this.board = board;
	}
	
	//getters and setters
	protected Board getBoard() {
		return board;
	}

	//methods
}
