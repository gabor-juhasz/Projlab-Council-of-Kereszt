package skeleton;

public class Sea extends Tile {
	
	public void addSnow() { 
		//A Tile addSnow() fuggvenye felul lesz definialva,
		//hiszen jatekmechanikailag semmi ertelme nem lenne
		//annak, ha a tenger Tile-ok be lennenek havazva
		System.out.println("Sea.addSnow()");
	}
	
	public void movedOn(Player p) { 
		//ra probalunk lepni majd a tengerre, viszont
		//ez le lesz kezelve, hogy erre ne legyen mod
		System.out.println("Sea.movedOn()");
	}
}
