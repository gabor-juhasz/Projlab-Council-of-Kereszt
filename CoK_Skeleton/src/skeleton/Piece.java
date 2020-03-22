package skeleton;

public abstract class Piece {

	public abstract void ability(Tile t);

	public void moved(Tile t) { 
		System.out.println("");
	}
	
	public void addItem(Item i) {
		System.out.println("");
	}
	
	public void removeItem(Item i) {
		System.out.println("");
	}
	
	public void useItem(Item i) { 
		System.out.println("");
	}
	
	public void setBodyTemp() { 
		System.out.println("");
	}
	
	public void setInWater(boolean value) {
		System.out.println("");
	}
	
	public Tile getTile() { 
		System.out.println("");
		return new Tile();
	}
}
