package skeleton;

public class Shovel implements Item {
	
	public void used(Piece p) { 
		//Használjuk az ásót
		System.out.println("Shovel.used()");
		
		//Lekérjük melyik tile-ról lapátolunk le havat
		Tile t = p.getTile();
		//Majd leveszünk róla két réteget, ugyanis
		//az ásóval két réteg havat tudunk eltávolítani az alap egy helyett
		t.removeSnow();
		t.removeSnow();
	}
}
