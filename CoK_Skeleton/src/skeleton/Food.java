package skeleton;

public class Food implements Item {
	
	public void used(Piece p) {
		//Értesítés a függvény meghívásáról
		System.out.println("Food.used()");
		
		//Függvény hívások
		p.incBodyTemp();
	}
}
