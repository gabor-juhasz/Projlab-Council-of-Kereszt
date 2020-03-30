package skeleton;

public class Rope implements Item {
	
	public void used(Piece p) {
		//Használjuk a kötelet
		System.out.println("Rope.used()");
		
		//Megmentjük a vízbe esett bábut
		this.savePiece(p);
	}
	
	public Piece getPiece() { 
		//Lekérjük melyik bábut akarjuk megmenteni
		System.out.println("Rope.getPiece()");
		return new Eskimo();
	}
	
	private void savePiece(Piece p) {
		//Megmentjük a bábut
		System.out.println("Rope.savePiece()");
	}
}
