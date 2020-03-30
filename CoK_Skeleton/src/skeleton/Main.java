package skeleton;

import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
				
		System.out.println("Üdvözöljük a Council of Kereszt skeleton programjában!\n" +
				"Válassza ki a futtatni kívánt szekvenciát:\n" + 
				"1. Game Start\n" + 
				"2. Snowstorm kills piece\n" +
				"3. Player moves\n" +
				"4. Player picks up and uses item\n" +
				"5. Player uses ability\n" +
				"0. Exit from this great program :'(");

		int userInput;
		Game game = new Game();
		Player player = new Player();
		Tile tile = new Tile();
		
		do 
	    {
		    userInput = scanner.nextInt();
	    	switch (userInput)
	    	{
	    		case 1:
	    			System.out.println("Sequence: 'Game Start' starting ");
	    			game.startGame();
	    			System.out.println("Sequence 'Game Start' ended...");
	    			break;
	    			
	    		case 2:
	    			System.out.println("Sequence: 'Snowstorm kills piece' starting ");
	    			game.snowStorm();
	    			System.out.println("Sequence 'Snowstorm kills piece' ended...");
					break;
					
	    		case 3:
	    			System.out.println("Sequence: 'Player moves' starting ");
	    			player.move(tile);
	    			System.out.println("Sequence 'Player moves' ended...");
	    			break;
	    			
	    		case 4:
	    			System.out.println("Sequence: 'Player picks up and uses item' starting ");
	    			player.pickUpItem(tile);
	    			System.out.println("Sequence 'Player picks up and uses item' ended...");
	    			break;
	    			
	    		case 5:
	    			System.out.println("Sequence: 'Player uses ability' starting ");
	    			player.useAbility(tile);
	    			System.out.println("Sequence 'Player uses ability' ended...");
	    			break;
	    			
	    		case 0:
	    			break;
	    			
	    		default:
	    			if (userInput > 100)
		    			System.out.println("Ez nem a NASA belsõ rendszere!");
	    			else if (userInput > 20)
	    				System.out.println("Na azért " + userInput + "eset kicsit durva lenne!");
	    			else System.out.println("Rossz input!");
	    			break;
	    	}
	    	System.out.println("Válassz új szekvenciát(1-5), vagy 0-val lépj ki\n");
	    } while (userInput != 0);
		scanner.close();
		

	}
}
