package skeleton;

import java.util.Scanner;

public abstract class Piece {

	public abstract void ability(Tile t);

	public void moved(Tile t) { 
		//Értesítés a függvény meghívásáról
		System.out.println("Piece.moved()");
		System.out.println("Valassza ki a futtatni kivant szekvenciat:\n1 : Unstable flips\n2 : Player falls into hole\n3 : Player can't move onto sea");
		
		//lokalis valtozok letrehozasa
		Player p = new Player();
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	   
	    if(n == 1)
	    	t = new Unstable();
		else if(n == 2)
			t = new Hole();
		else if(n == 3)
			t = new Sea();
	    
	    //fuggvenyhivasok
		t.movedOn(p);
	}
	
	public void addItem(Item i) {
		//Hozzáadja az itemet a játékos figurájához
		System.out.println("Piece.addItem()");
	}
	
	public void removeItem(Item i) {
		System.out.println("Piece.removeItem()");
	}
	
	public void useItem(Item i) { 
		//Használja az itemet
		System.out.println("Piece.useItem()");

		//Elhasználja az itemet
		i.used(this);
	}
	
	public void incBodyTemp() { 
		//Növeli a testhõ értékét 1-el
		System.out.println("Piece.incBodyTemp()");
	}
	
	public void getInWater() {
		//Visszaadja, hogy a karakter vízben van-e
		System.out.println("Piece.getInWater()");
	}
	
	public void setInWater(boolean value) {
		//Jelzi, hogy a karakter vízbe esett
		System.out.println("Piece.setInWater()");
	}
	
	public Tile getTile() { 
		//Lekérdezi a tile-t amin tartózkodik a játékos
		System.out.println("Piece.getTile()");
		
		//Egy újonnan létrehozott lokális változót adunk vissza a tesztelés kedvéért
		return new Tile();
	}
}
