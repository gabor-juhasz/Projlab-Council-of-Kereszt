package skeleton;

public class Rope implements Item {
	
	public void used(Piece p) {
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Rope.used()");
		
		//F�ggv�ny h�v�sok
		this.savePiece(p);
	}
	
	public Piece getPiece() { 
		System.out.println("Rope.getPiece()");
		return new Eskimo();
	}
	
	private void savePiece(Piece p) {
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Rope.savePiece()");
	}
}
