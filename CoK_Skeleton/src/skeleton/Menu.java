package skeleton;

public interface Menu {
	
	static void menuPrint() {
		//Információ kiírása a user számára
		System.out.println("Üdvözöljük a Council of Kereszt skeleton programjában!\n" +
				"Válassza ki a futtatni kívánt szekvencia sorszámát:\n" + 
				"1. Game Start\n" + 
				"2. Snowstorm kills piece\n" +
				"3. Player moves\n" +
				"4. Player picks up and uses item\n" +
				"5. Player uses ability\n" +
				"0. Exit from this great program :'(");
	}
	
	static void input() {
		//Input kérése a usertõl, csak egész szám
		int userInput;
		Game game = new Game();
		Player player = new Player();
		Tile tile = new Tile();
		
		//Itt lehet kiválasztani az 5 alapszekvencia egyikét vagy kilépni a programból
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
	    			
	    			//Nemlétezõ sorszám esetén új inputot kér
	    		default:
	    			if (userInput > 100)
		    			System.out.println("Ez nem a NASA belsõ rendszere!");
	    			else if (userInput > 20)
	    				System.out.println("Na azért " + userInput + " eset kicsit durva lenne!");
	    			else System.out.println("Rossz input!");
	    			break;
	    	}
	    	if (userInput == 0)
	    		System.out.println("Remljük sok pontot kapunk...");
	    	//A szekvencia lefutása után visszatér a menübe és új inputot kér
	    	else System.out.println("\n|MENÜ| Válassz új szekvenciát(1-5), vagy 0-val lépj ki\n");
	    } while (userInput != 0);
		
		Main.scanner.close();
	}
}
