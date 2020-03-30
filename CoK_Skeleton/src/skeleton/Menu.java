package skeleton;

public interface Menu {
	
	static void menuPrint() {
		//Inform�ci� ki�r�sa a user sz�m�ra
		System.out.println("�dv�z�lj�k a Council of Kereszt skeleton programj�ban!\n" +
				"V�lassza ki a futtatni k�v�nt szekvencia sorsz�m�t:\n" + 
				"1. Game Start\n" + 
				"2. Snowstorm kills piece\n" +
				"3. Player moves\n" +
				"4. Player picks up and uses item\n" +
				"5. Player uses ability\n" +
				"0. Exit from this great program :'(");
	}
	
	static void input() {
		//Input k�r�se a usert�l, csak eg�sz sz�m
		int userInput;
		Game game = new Game();
		Player player = new Player();
		Tile tile = new Tile();
		
		//Itt lehet kiv�lasztani az 5 alapszekvencia egyik�t vagy kil�pni a programb�l
		do 
	    {
		    userInput = Main.scanner.nextInt();
	    	switch (userInput)
	    	{
	    		case 1:
	    			//Game start szekvencia
	    			System.out.println("Sequence: 'Game Start' starting ");
	    			game.startGame();
	    			System.out.println("Sequence 'Game Start' ended...");
	    			break;
	    			
	    		case 2:
	    			//Snowstorm kills piece szekvencia
	    			System.out.println("Sequence: 'Snowstorm kills piece' starting ");
	    			game.snowStorm();
	    			System.out.println("Sequence 'Snowstorm kills piece' ended...");
					break;
					
	    		case 3:
	    			//Player moves szekvencia
	    			System.out.println("Sequence: 'Player moves' starting ");
	    			player.move(tile);
	    			System.out.println("Sequence 'Player moves' ended...");
	    			break;
	    			
	    		case 4:
	    			//Player picks up and uses item szekvencia
	    			System.out.println("Sequence: 'Player picks up and uses item' starting ");
	    			player.pickUpItem(tile);
	    			System.out.println("Sequence 'Player picks up and uses item' ended...");
	    			break;
	    			
	    		case 5:
	    			//Player uses ability szekvencia
	    			System.out.println("Sequence: 'Player uses ability' starting ");
	    			player.useAbility(tile);
	    			System.out.println("Sequence 'Player uses ability' ended...");
	    			break;
	    			
	    		case 0:
	    			break;
	    			
	    			//Neml�tez� sorsz�m eset�n �j inputot k�r
	    		default:
	    			if (userInput > 100)
		    			System.out.println("Ez nem a NASA bels� rendszere!");
	    			else if (userInput > 20)
	    				System.out.println("Na az�rt " + userInput + " eset kicsit durva lenne!");
	    			else System.out.println("Rossz input!");
	    			break;
	    	}
	    	if (userInput == 0)
	    		System.out.println("Remlj�k sok pontot kapunk...");
	    	//A szekvencia lefut�sa ut�n visszat�r a men�be �s �j inputot k�r
	    	else System.out.println("\n|MEN�| V�lassz �j szekvenci�t(1-5), vagy 0-val l�pj ki\n");
	    } while (userInput != 0);
		
		Main.scanner.close();
	}
}
