package skeleton;

public class Food implements Item {
	
	public void used(Piece p) {
		//Megesszük az ételt
		System.out.println("Food.used()");
		
		//Az étel növeli 1 ponttal a testhõ értékét
		p.incBodyTemp();
	}
}
