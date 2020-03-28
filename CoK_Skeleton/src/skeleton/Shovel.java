package skeleton;

public class Shovel implements Item {
	
	public void used(Piece p) { 
		//Értesítés a függvény meghívásáról
		System.out.println("Shovel.used()");
		
		//Függvény hívások
		Tile t = p.getTile();
		//Az ásóval két réteg havat tudunk eltávolítani egy helyett
		t.removeSnow();
		t.removeSnow();
	}
}
