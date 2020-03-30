package skeleton;

public class Ice extends Tile {
	
	public void movedOn(Player p) {
		System.out.println("Ice.movedOn()");
	}
	
	public Item getItem() {
		//Lek�rj�k milyen item van a j�gt�bl�n
		System.out.println("Ice.getItem()");
		return new Food();
	}
	
	public void setItem(Item i) {
		//Elhelyezi a kapott t�rgyat a j�gt�bl�n
		System.out.println("Ice.setItem()");
	}
}
