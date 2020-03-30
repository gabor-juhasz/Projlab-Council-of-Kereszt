package skeleton;

public class Tile {
	
	public void addSnow() {
		System.out.println("Tile.addSnow()");
	}
	
	public void removeSnow() {
		//Elt�vol�tunk egy r�teg havat a tile-r�l
		System.out.println("Tile.removeSnow()");
	}
	
	public void movedOn(Player p) { 
		System.out.println("Tile.movedOn()");
	}
	
	public void buildIgloo() { 
		System.out.println("Tile.buildIgloo()");
	}
	
	public int getSnow() { 
		//Lek�rj�k mennyi h� van a tile-on
		System.out.println("Tile.getSnow()");
		
		//A szkeletonban a tesztel�s kedv��rt mindig null�t ad vissza
		return 0;
	}
	
	public int getCapacity() { 
		System.out.println("Tile.getCapacity()");
		return 0;
	}
}
