package skeleton;

public class Rope implements Item {
	
	public void used(Piece p) {
		System.out.println("Rope.used()");
	}
	
	public Piece getPiece() { 
		System.out.println("Rope.getPiece()");
		return new Eskimo();
	}
	
	private void savePiece(Piece p) {
		System.out.println("Rope.savePiece()");
	}
}
