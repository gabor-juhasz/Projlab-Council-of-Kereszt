package skeleton;

public abstract class Piece {

	public void moved(Tile t) {
	}
	
	public abstract void ability(Tile t);
	
	public void addItem(Item i) {
	}
	
	public void removeItem(Item i) {
	}
	
	public void useItem(Item i) {
	}
	
	public void setBodyTemp() {
	}
	
	public void setInWater(boolean value) {
	}
	
	public Tile getTile() { return new Tile();
	}
}
