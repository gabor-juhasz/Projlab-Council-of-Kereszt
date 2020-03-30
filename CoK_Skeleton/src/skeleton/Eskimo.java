package skeleton;

public class Eskimo extends Piece {
	
	public void ability(Tile t) { 
		//Eskimo használja a képességét, azaz iglut épít
		System.out.println("Eskimo.ability()");
		
		t.buildIgloo();		//Tile buildIgloo függvényének meghívása
	}

}
