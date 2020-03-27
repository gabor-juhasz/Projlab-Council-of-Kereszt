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
	
	public void incBodyTemp() { 
		System.out.println("Piece.incBodyTemp()");
	}
	
	public void decBodyTemp() { 
		System.out.println("Piece.decBodyTemp()");
		Game game = new Game();
		
		game.notifyPlayerDied(this);
	}
	
	public void setInWater(boolean value) {
		System.out.println("Piece.setInWater()");
	}
	
	public Tile getTile() { 
		System.out.println("Piece.getTile()");
		return new Tile();
	}
}
