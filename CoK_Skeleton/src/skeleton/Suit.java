package skeleton;

public class Suit implements Item {
	
	public void used(Piece p) {
		//Haszn�ljuk a b�v�rruh�t
		System.out.println("Suit.used()");
		
		//A b�v�rruh�val �t tudunk menni v�zen is
		p.getInWater();
		p.setInWater(false);
		Tile t = this.getDirection();
		p.moved(t);
	}
	
	public Tile getDirection() { 
		//Lek�rdezz�k az ir�nyt
		System.out.println("Suit.getDirection()");
		
		//Egy �jonnan l�trehozott lok�lis v�ltoz�t adunk vissza a tesztel�s kedv��rt
		return new Ice();
	}
}
