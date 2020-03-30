package skeleton;

public class Shovel implements Item {
	
	public void used(Piece p) { 
		//Haszn�ljuk az �s�t
		System.out.println("Shovel.used()");
		
		//Lek�rj�k melyik tile-r�l lap�tolunk le havat
		Tile t = p.getTile();
		//Majd levesz�nk r�la k�t r�teget, ugyanis
		//az �s�val k�t r�teg havat tudunk elt�vol�tani az alap egy helyett
		t.removeSnow();
		t.removeSnow();
	}
}
