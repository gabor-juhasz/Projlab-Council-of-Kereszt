package skeleton;

public class Suit implements Item {
	
	public void used(Piece p) {
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Suit.used()");
		
		//F�ggv�ny h�v�sok
		p.getInWater();
		p.setInWater(false);
		Tile t = this.getDirection();
		p.moved(t);
	}
	
	public Tile getDirection() { 
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Suit.getDirection()");
		
		//Egy �jonnan l�trehozott lok�lis v�ltoz�t adunk vissza a tesztel�s kedv��rt
		return new Ice();
	}
}
