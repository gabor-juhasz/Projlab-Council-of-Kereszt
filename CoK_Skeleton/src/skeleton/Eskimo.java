package skeleton;

public class Eskimo extends Piece {
	
	public void ability(Tile t) { 
		//Eskimo haszn�lja a k�pess�g�t, azaz iglut �p�t
		System.out.println("Eskimo.ability()");
		
		//Tile buildIgloo f�ggv�ny�nek megh�v�sa
		t.buildIgloo();		
	}

}
