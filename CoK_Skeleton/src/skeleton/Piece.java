package skeleton;

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
		//Értesítés a függvény meghívásáról
		System.out.println("Piece.addItem()");
	}
	
	public void removeItem(Item i) {
		System.out.println("Piece.removeItem()");
	}
	
	public void useItem(Item i) { 
		//Értesítés a függvény meghívásáról
		System.out.println("Piece.useItem()");

		//Függvény hívások
		i.used(this);
	}
	
	public void incBodyTemp() { 
		//Értesítés a függvény meghívásáról
		System.out.println("Piece.incBodyTemp()");
	}
	
	public void getInWater() {
		//Értesítés a függvény meghívásáról
		System.out.println("Piece.getInWater()");
	}
	
	public void setInWater(boolean value) {
		//Értesítés a függvény meghívásáról
		System.out.println("Piece.setInWater()");
	}
	
	public Tile getTile() { 
		//Értesítés a függvény meghívásáról
		System.out.println("Piece.getTile()");
		
		//Egy újonnan létrehozott lokális változót adunk vissza a tesztelés kedvéért
		return new Tile();
	}
}
