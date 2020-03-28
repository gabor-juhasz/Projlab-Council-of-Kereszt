package skeleton;

import java.util.Scanner;

public class Player {
	
	public void move(Tile t) {
		System.out.println("Player.move()");
	}
	
	public void useItem(Item i) { 
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Player.useItem()");
		//Lok�lis v�ltoz�k l�trehoz�sa
		Piece eskimoPiece = new Eskimo();
		
		//F�ggv�ny h�v�sok
		eskimoPiece.useItem(i);
	}
	
	public void useAbility(Tile t) {
		System.out.println("Player.useAbility()");
	}
	
	public void pickUpItem(Tile t) {
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Player.pickUpItem()");
		//Lok�lis v�ltoz�k l�trehoz�sa
		Ice ice = new Ice();
		Piece eskimoPiece = new Eskimo();
		
		//F�ggv�ny h�v�sok
		ice.getSnow();
		Item i = ice.getItem();
		eskimoPiece.addItem(i);
		
		//El�gaz�s, itt a felhaszn�l� kiv�laszthatja, hogy mely szekvenci�t szeretn� a tov�bbiakban futtatni
		//Ezzel l�nyeg�ben azt szimul�ljuk, hogy a kiv�lasztott t�pus� item-et veszi fel a j�t�kos,
		//majd haszn�lja is azt.
		Scanner scanner = new Scanner(System.in);
	    System.out.println("V�lassza ki a futtatni k�v�nt szekvenci�t\n" + 
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
