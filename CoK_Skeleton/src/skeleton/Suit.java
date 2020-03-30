package skeleton;

public class Suit implements Item {
	
	public void used(Piece p) {
		//Használjuk a búvárruhát
		System.out.println("Suit.used()");
		
		//A búvárruhával át tudunk menni vízen is
		p.getInWater();
		p.setInWater(false);
		Tile t = this.getDirection();
		p.moved(t);
	}
	
	public Tile getDirection() { 
		//Lekérdezzük az irányt
		System.out.println("Suit.getDirection()");
		
		//Egy újonnan létrehozott lokális változót adunk vissza a tesztelés kedvéért
		return new Ice();
	}
}
