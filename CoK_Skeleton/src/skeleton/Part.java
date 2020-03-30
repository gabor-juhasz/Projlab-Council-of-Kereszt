package skeleton;

public class Part implements Item {
	
	public void used(Piece p) {
		//Haszn�ljuk a jelz�pisztoly r�szeket
		System.out.println("Part.used()");
		Game g = new Game();
		
		//Amikor �sszerakjuk a jelz�pisztolyt �s elhaszn�ljuk v�get �r a j�t�k
		g.notifyWin();
	}
}
