package skeleton;

public class Food implements Item {
	
	public void used(Piece p) {
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Food.used()");
		
		//F�ggv�ny h�v�sok
		p.incBodyTemp();
	}
}
