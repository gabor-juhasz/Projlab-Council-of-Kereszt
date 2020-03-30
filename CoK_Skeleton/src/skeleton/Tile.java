package skeleton;

public class Tile {
	
	public void addSnow() {
		System.out.println("Tile.addSnow()");
	}
	
	public void removeSnow() {
		//Eltávolítunk egy réteg havat a tile-ról
		System.out.println("Tile.removeSnow()");
	}
	
	public void movedOn(Player p) { 
		System.out.println("Tile.movedOn()");
	}
	
	public void buildIgloo() { 
		System.out.println("Tile.buildIgloo()");
	}
	
	public int getSnow() { 
		//Lekérjük mennyi hó van a tile-on
		System.out.println("Tile.getSnow()");
		
		//A szkeletonban a tesztelés kedvéért mindig nullát ad vissza
		return 0;
	}
	
	public int getCapacity() { 
		System.out.println("Tile.getCapacity()");
		return 0;
	}
}
