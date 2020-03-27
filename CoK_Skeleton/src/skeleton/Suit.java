package skeleton;

public class Suit implements Item {
	
	public void used(Piece p) {
		System.out.println("Suit.used()");
	}
	
	public Tile getDirection() { 
		System.out.println("Suit.getDirection()");
		return new Tile();
	}
}
