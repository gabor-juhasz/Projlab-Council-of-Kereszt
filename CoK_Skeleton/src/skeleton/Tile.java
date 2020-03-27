package skeleton;

public class Tile {
	
	public void addSnow() {
		System.out.println("Tile.addSnow()");
	}
	
	public void removeSnow() {
		System.out.println("Tile.removeSnow()");
	}
	
	public void movedOn(Player p) { 
		System.out.println("Tile.movedOn()");
	}
	
	public void buildIgloo() { 
		System.out.println("Tile.buildIgloo()");
	}
	
	public int getSnow() { 
		System.out.println("Tile.getSnow()");
		return 0;
	}
	
	public int getCapacity() { 
		System.out.println("Tile.getCapacity()");
		return 0;
	}

}
