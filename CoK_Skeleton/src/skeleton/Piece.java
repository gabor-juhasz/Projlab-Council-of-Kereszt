package skeleton;

public abstract class Piece {

	public abstract void ability(Tile t);

	public void moved(Tile t) { 
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Piece.moved()");
	}
	
	public void addItem(Item i) {
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Piece.addItem()");
	}
	
	public void removeItem(Item i) {
		System.out.println("Piece.removeItem()");
	}
	
	public void useItem(Item i) { 
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Piece.useItem()");

		//F�ggv�ny h�v�sok
		i.used(this);
	}
	
	public void incBodyTemp() { 
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Piece.incBodyTemp()");
	}
	
	public void getInWater() {
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Piece.getInWater()");
	}
	
	public void setInWater(boolean value) {
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Piece.setInWater()");
	}
	
	public Tile getTile() { 
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Piece.getTile()");
		
		//Egy �jonnan l�trehozott lok�lis v�ltoz�t adunk vissza a tesztel�s kedv��rt
		return new Tile();
	}
}
