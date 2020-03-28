package skeleton;

public class Shovel implements Item {
	
	public void used(Piece p) { 
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Shovel.used()");
		
		//F�ggv�ny h�v�sok
		Tile t = p.getTile();
		//Az �s�val k�t r�teg havat tudunk elt�vol�tani egy helyett
		t.removeSnow();
		t.removeSnow();
	}
}
