package skeleton;

public class Explorer extends Piece {
	
	public void ability(Tile t) { 
		//Explorer haszn�lja a k�pess�g�t, megn�zi a szomsz�dos mez� teherb�r�s�t
		System.out.println("Explorer.ability()");
		
		//Tile getCapacity f�ggv�ny�nek megh�v�sa
		t.getCapacity(); 			
	}

}
