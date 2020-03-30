package skeleton;

public class Explorer extends Piece {
	
	public void ability(Tile t) { 
		//Explorer használja a képességét, megnézi a szomszédos mezõ teherbírását
		System.out.println("Explorer.ability()");
		
		int capacity = t.getCapacity(); 	//Tile getCapacity függvényének meghívása		
	}

}
