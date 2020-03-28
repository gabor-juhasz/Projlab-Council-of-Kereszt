package skeleton;

public class Part implements Item {
	
	public void used(Piece p) {
		//Értesítés a függvény meghívásáról
		System.out.println("Part.used()");
		//Lokális változók létrehozása
		Game g = new Game();
		
		//Függvény hívások
		g.notifyWin();
	}
}
