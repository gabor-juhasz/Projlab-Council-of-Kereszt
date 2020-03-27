package skeleton;

public class Eskimo extends Piece {
	
	public void ability(Tile t) { 
		System.out.println("Eskimo.ability()");
		t.buildIgloo();
	}

}
