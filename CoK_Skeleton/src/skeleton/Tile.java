package skeleton;

public class Tile {
	
	public void addSnow() {
		//Horeteget teszunk egy tile-re
		System.out.println("Tile.addSnow()");
	}
	
	public void removeSnow() {
		//Eltávolítunk egy réteg havat a tile-ról
		System.out.println("Tile.removeSnow()");
	}
	
	public void movedOn(Player p) { 
		//Akkor hivodik meg, hogyha ralepunk az adott tile-re
		//Termeszetesen kulonbozo fele tablak mashogy reagalnak erre
		//Pl. instabil ellenorzi a kapacitast, lyuknal a babu
		//azonnal beleesik a vizbe, etc.
		System.out.println("Tile.movedOn()");
	}
	
	public void buildIgloo() {
		//Epitunk egy iglut az adott mezon
		System.out.println("Tile.buildIgloo()");
	}
	
	public int getSnow() { 
		//Lekérjük mennyi hó van a tile-on
		System.out.println("Tile.getSnow()");
		
		//A szkeletonban a tesztelés kedvéért mindig nullát ad vissza
		return 0;
	}
	
	public int getCapacity() { 
		//Visszaadja a Tile kapacitasat, azaz mennyi babut bir el
		System.out.println("Tile.getCapacity()");
		return 0;
	}
}
