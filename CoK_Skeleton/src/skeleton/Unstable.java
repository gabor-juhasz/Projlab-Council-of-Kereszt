package skeleton;

public class Unstable extends Ice {
	
	public void movedOn(Player p) {
		System.out.println("Unstable.movedOn()");
		
		//Teszteseten kivul, normal korulmenyek kozott akkor fordul
		//at, ha tullepjuk az instabil mezo teherbirasat (pl. mikor a
		//4. babu ralep a 3 "kapacitasu" mezore)
		this.flip();
	}
	
	public void flip() {
		System.out.println("Unstable.flip()");
		
		
		Eskimo eskimo = new Eskimo();
		
		//True parameterrel a vizbe helyezzuk a babu(i)nkat,
		//hiszen atfordul a jegtablank
		eskimo.setInWater(true);
	}
}
