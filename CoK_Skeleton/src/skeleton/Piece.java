package skeleton;

import java.util.Scanner;

public abstract class Piece {

	public abstract void ability(Tile t);

	public void moved(Tile t) { 
		//ertesites a fv meghivasarol
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
		System.out.println("Piece.addItem()");
	}
	
	public void removeItem(Item i) {
		System.out.println("Piece.removeItem()");
	}
	
	public void useItem(Item i) { 
		System.out.println("Piece.useItem()");
	}
	
	public void setBodyTemp() { 
		System.out.println("Piece.setBodyTemp()");
	}
	
	public void setInWater(boolean value) {
		System.out.println("Piece.setInWater()");
	}
	
	public Tile getTile() { 
		System.out.println("Piece.getTile()");
		return new Tile();
	}
}
