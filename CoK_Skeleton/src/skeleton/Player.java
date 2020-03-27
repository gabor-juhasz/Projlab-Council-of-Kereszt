package skeleton;

public class Player {
	
	public void move(Tile t) {
		System.out.println("Player.move()");
	}
	
	public void useItem(Item i) { 
		System.out.println("Player.useItem()");
	}
	
	public void useAbility(Tile t) {
		System.out.println("Player.useAbility()");
	}
	
	public void pickUpItem(Item i) {
		System.out.println("Player.pickUpItem()");
	}
}
