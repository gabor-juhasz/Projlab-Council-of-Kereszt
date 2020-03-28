package skeleton;

import java.util.Scanner;

public class Player {
	
	public void move(Tile t) {
		System.out.println("Player.move()");
	}
	
	public void useItem(Item i) { 
		//Értesítés a függvény meghívásáról
		System.out.println("Player.useItem()");
		//Lokális változók létrehozása
		Piece eskimoPiece = new Eskimo();
		
		//Függvény hívások
		eskimoPiece.useItem(i);
	}
	
	public void useAbility(Tile t) {
		System.out.println("Player.useAbility()");
	}
	
	public void pickUpItem(Tile t) {
		//Értesítés a függvény meghívásáról
		System.out.println("Player.pickUpItem()");
		//Lokális változók létrehozása
		Ice ice = new Ice();
		Piece eskimoPiece = new Eskimo();
		
		//Függvény hívások
		ice.getSnow();
		Item i = ice.getItem();
		eskimoPiece.addItem(i);
		
		//Elágazás, itt a felhasználó kiválaszthatja, hogy mely szekvenciát szeretné a továbbiakban futtatni
		//Ezzel lényegében azt szimuláljuk, hogy a kiválasztott típusú item-et veszi fel a játékos,
		//majd használja is azt.
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Válassza ki a futtatni kívánt szekvenciát\n" + 
	    				   "1. Player uses shovel\n " + 
	    				   "2. Player uses suit\n" +
	    				   "3. Player uses part\n" +
	    				   "4. Player uses rope\n" +
	    				   "5. Player eats food\n");
	    int userInput = scanner.nextInt();
	    switch (userInput)
	    {
	        case 1:
	            i = new Shovel();
	            useItem(i);
	            break;
	        case 2:
	        	i = new Suit();
				useItem(i);
				break;
	        case 3:
	            i = new Part();
	            useItem(i);
	            break;
	        case 4:
	            i = new Rope();
	            useItem(i);
	            break;
	        case 5:
	            i = new Food();
	            useItem(i);
	            break;
	        default:
	        	System.out.println("Rossz input!");
	        	break;
	    }
	}
}
