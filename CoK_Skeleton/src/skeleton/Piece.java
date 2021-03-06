package skeleton;

public abstract class Piece {

	public abstract void ability(Tile t);
	
	//
	public void moved(Tile t) { 
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Piece.moved()");
		if (!(t instanceof Ice))
		{
			System.out.println("Valassza ki a futtatni kivant szekvenciat:\n1 : Unstable flips\n2 : Player falls into hole\n3 : Player can't move onto sea");
		
			//lokalis valtozok letrehozasa
			Player p = new Player();
			int userInput;
			
			do 
			{
				userInput = Main.scanner.nextInt();
				if(userInput == 1)			//elso esetben azt teszteljuk, amikor egy babu egy instabil jegmezore lep
					t = new Unstable();
				else if(userInput == 2)		//masodik esetben az kovetkezik, amikor lyukra lepunk
					t = new Hole();
				else if(userInput == 3)		//vegso esetben pedig hogyha egy tenger mezore probalnank lepni
					t = new Sea();
			} while (userInput < 1 || userInput > 3);
			
	    
			//fuggvenyhivasok
			t.movedOn(p);
		}
	}
	
	public void addItem(Item i) {
		//Hozz�adja az itemet a j�t�kos figur�j�hoz
		System.out.println("Piece.addItem()");
	}
	
	public void removeItem(Item i) {
		System.out.println("Piece.removeItem()");
	}
	
	public void useItem(Item i) { 
		//Haszn�lja az itemet
		System.out.println("Piece.useItem()");

		//Elhaszn�lja az itemet
		i.used(this);
	}
	
	public void incBodyTemp() { 
		//N�veli a testh� �rt�k�t 1-el
		System.out.println("Piece.incBodyTemp()");
	}
	
	public void decBodyTemp() { 
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Piece.decBodyTemp()");
	}
	
	public void getInWater() {
		//Visszaadja, hogy a karakter v�zben van-e
		System.out.println("Piece.getInWater()");
	}
	
	//True parameterrel a vizbe helyezi a babut (pl. Unstable flip() fuggvenye)
	//False parameterrel "kihuzzuk" a vizbol a babut (pl. Suit used() fuggvenye)
	public void setInWater(boolean value) {
		//Jelzi, hogy a karakter v�zbe esett
		System.out.println("Piece.setInWater()");
	}
	
	public Tile getTile() { 
		//Lek�rdezi a tile-t amin tart�zkodik a j�t�kos
		System.out.println("Piece.getTile()");
		
		//Egy �jonnan l�trehozott lok�lis v�ltoz�t adunk vissza a tesztel�s kedv��rt
		return new Tile();
	}
}