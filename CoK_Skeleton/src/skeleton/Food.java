package skeleton;

public class Food implements Item {
	
	public void used(Piece p) {
		//Megessz�k az �telt
		System.out.println("Food.used()");
		
		//Az �tel n�veli 1 ponttal a testh� �rt�k�t
		p.incBodyTemp();
	}
}
