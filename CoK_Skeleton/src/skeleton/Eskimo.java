package skeleton;

public class Eskimo extends Piece {
	
	public void ability(Tile t) { 
		//Eskimo használja a képességét, azaz iglut épít
		System.out.println("Eskimo.ability()");
		
		//Tile buildIgloo függvényének meghívása
		t.buildIgloo();		
	}

}
