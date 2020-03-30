package skeleton;

public class Explorer extends Piece {
	
	public void ability(Tile t) { 
		//Explorer használja a képességét, megnézi a szomszédos mezõ teherbírását
		System.out.println("Explorer.ability()");
		
		//Tile getCapacity függvényének meghívása
		t.getCapacity(); 			
	}

}
