package skeleton;

public class Part implements Item {
	
	public void used(Piece p) {
		//Használjuk a jelzõpisztoly részeket
		System.out.println("Part.used()");
		Game g = new Game();
		
		//Amikor összerakjuk a jelzõpisztolyt és elhasználjuk véget ér a játék
		g.notifyWin();
	}
}
