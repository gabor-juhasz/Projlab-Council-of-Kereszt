package skeleton;

public class Suit implements Item {
	
	public void used(Piece p) {
		//Értesítés a függvény meghívásáról
		System.out.println("Suit.used()");
		
		//Függvény hívások
		p.getInWater();
		p.setInWater(false);
		Tile t = this.getDirection();
		p.moved(t);
	}
	
	public Tile getDirection() { 
		//Értesítés a függvény meghívásáról
		System.out.println("Suit.getDirection()");
		
		//Egy újonnan létrehozott lokális változót adunk vissza a tesztelés kedvéért
		return new Ice();
	}
}
