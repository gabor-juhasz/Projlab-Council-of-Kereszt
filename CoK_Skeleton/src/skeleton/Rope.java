package skeleton;

public class Rope implements Item {
	
	public void used(Piece p) {
		//Értesítés a függvény meghívásáról
		System.out.println("Rope.used()");
		
		//Függvény hívások
		this.savePiece(p);
	}
	
	public Piece getPiece() { 
		System.out.println("Rope.getPiece()");
		return new Eskimo();
	}
	
	private void savePiece(Piece p) {
		//Értesítés a függvény meghívásáról
		System.out.println("Rope.savePiece()");
	}
}
