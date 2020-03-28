package skeleton;

public class Ice extends Tile {
	
	public void movedOn(Player p) {
		System.out.println("Ice.movedOn()");
	}
	
	public Item getItem() { 
		System.out.println("Ice.getItem()");
		return new Food();
	}
	
	public void setItem(Item i) {
		System.out.println("Ice.setItem()");
	}
}
