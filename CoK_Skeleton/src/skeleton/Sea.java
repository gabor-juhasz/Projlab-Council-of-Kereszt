package skeleton;

public class Sea extends Tile {
	
	public void addSnow() { 
		System.out.println("Sea.addSnow()");
	}
	
	public void movedOn(Player p) { 
		//ra probalunk lepni majd a tengerre, viszont
		//ez le lesz kezelve, hogy erre ne legyen mod
		System.out.println("Sea.movedOn()");
	}
}
