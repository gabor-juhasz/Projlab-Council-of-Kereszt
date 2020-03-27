package skeleton;

public abstract class Piece {

	public abstract void ability(Tile t);

	public void moved(Tile t) { 
		System.out.println("Piece.moved()");
	}
	
	public void addItem(Item i) {
		System.out.println("Piece.addItem()");
	}
	
	public void removeItem(Item i) {
		System.out.println("Piece.removeItem()");
	}
	
	public void useItem(Item i) { 
		System.out.println("Piece.useItem()");
	}
	
	public void setBodyTemp() { 
		System.out.println("Piece.setBodyTemp()");
	}
	
	public void setInWater(boolean value) {
		System.out.println("Piece.setInWater()");
	}
	
	public Tile getTile() { 
		System.out.println("Piece.getTile()");
		return new Tile();
	}
}
