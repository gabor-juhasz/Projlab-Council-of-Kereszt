package skeleton;

public class Rope implements Item {
	
	public void used(Piece p) {
		//Haszn�ljuk a k�telet
		System.out.println("Rope.used()");
		
		//Megmentj�k a v�zbe esett b�but
		this.savePiece(p);
	}
	
	public Piece getPiece() { 
		//Lek�rj�k melyik b�but akarjuk megmenteni
		System.out.println("Rope.getPiece()");
		return new Eskimo();
	}
	
	private void savePiece(Piece p) {
		//Megmentj�k a b�but
		System.out.println("Rope.savePiece()");
	}
}
