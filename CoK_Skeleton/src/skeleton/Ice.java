package skeleton;

public class Ice extends Tile {
	
	public void movedOn(Player p) {
		System.out.println("Ice.movedOn()");
	}
	
	public Item getItem() {
		//Lekérjük milyen item van a jégtáblán
		System.out.println("Ice.getItem()");
		return new Food();
	}
	
	public void setItem(Item i) {
		//Elhelyezi a kapott tárgyat a jégtáblán
		System.out.println("Ice.setItem()");
	}
}
