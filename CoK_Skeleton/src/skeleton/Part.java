package skeleton;

public class Part implements Item {
	
	public void used(Piece p) {
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Part.used()");
		//Lok�lis v�ltoz�k l�trehoz�sa
		Game g = new Game();
		
		//F�ggv�ny h�v�sok
		g.notifyWin();
	}
}
