package skeleton;

public class Hole extends Tile {
	
	public void movedOn(Player p) {
		System.out.println("Hole.movedOn()");
		
		Eskimo eskimo = new Eskimo();
		
		//Ha egy lyukra ralep egy babu, azt 
		//azonnal vizbe fogjuk helyezni
		eskimo.setInWater(true);
	}
}
