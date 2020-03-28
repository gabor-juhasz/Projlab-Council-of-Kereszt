package skeleton;

public abstract class Piece {

	public abstract void ability(Tile t);

	public void moved(Tile t) { 
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
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
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Piece.addItem()");
	}
	
	public void removeItem(Item i) {
		System.out.println("Piece.removeItem()");
	}
	
	public void useItem(Item i) { 
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Piece.useItem()");

		//F�ggv�ny h�v�sok
		i.used(this);
	}
	
	public void incBodyTemp() { 
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Piece.incBodyTemp()");
	}
	
	public void getInWater() {
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Piece.getInWater()");
	}
	
	public void setInWater(boolean value) {
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Piece.setInWater()");
	}
	
	public Tile getTile() { 
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Piece.getTile()");
		
		//Egy �jonnan l�trehozott lok�lis v�ltoz�t adunk vissza a tesztel�s kedv��rt
		return new Tile();
	}
}
