package skeleton;
import java.util.Scanner;

public class Player {
	
	public void move(Tile t) 
	{
		//ertesites a fv meghivasarol
		System.out.println("Player.move()");
		
		
		//lokalis valtozok letrehozasa
		Eskimo e = new Eskimo();
		
		//fuggvenyhivasok
		e.moved(t);
	}
	
	public void useItem(Item i) { 
		//A játékos használja a bábujánál levõ itemet
		System.out.println("Player.useItem()");
		//Lokális változónak létrehozunk egy bábut
		Piece eskimoPiece = new Eskimo();
		
		//Majd meghívjuk a bábu useItem függvényét
		eskimoPiece.useItem(i);
	}
	
	public void useAbility(Tile t) {
		System.out.println("Player.useAbility()");
		
		//Mivel 2 szekvencia is ezzel a függvénnyel kezdõdik, ezért meg kell kérdezni, hogy melyik szekvenciát akarjuk lefuttatni
		System.out.println("Válassza ki a futtatni kívánt szekvenciát");
		System.out.println("1. Explorer checks capacity");
		System.out.println("2. Eskimo builds igloo");
		
		//Válasz beolvasása
		int userInput;

		do {
			userInput = Main.scanner.nextInt();
			
			if(userInput == 1) {
				Explorer explorer = new Explorer();	//Ha az elsõt választjuk, akkor az Explorer ability függvényét hívjuk meg
				explorer.ability(t);
			}
			else if(userInput == 2){
				Eskimo eskimo = new Eskimo();	//Ha a másodikat választjuk, akkor az Eskimo ability függvényét hívjuk meg
				eskimo.ability(t);
			}
			else System.out.println("Rossz input!");
		} while (userInput < 1 || userInput > 2);
	}
	
	public void pickUpItem(Tile t) {
		//A játékot felveszi a tárgyat
		System.out.println("Player.pickUpItem()");
		Ice ice = new Ice();
		Piece eskimoPiece = new Eskimo();
		
		//Elõször lekérjük, hogy azon a mezõn a játékos bábuja van, mennyi hó van.
		ice.getSnow();
		//Majd mivel nincs hó rajta, felvesszük a tárgyat
		Item i = ice.getItem();
		//És hozzáadjuk a bábuhoz
		eskimoPiece.addItem(i);
		
		//Elágazás, itt a felhasználó kiválaszthatja, hogy mely szekvenciát szeretné a továbbiakban futtatni
		//Ezzel lényegében azt szimuláljuk, hogy a kiválasztott típusú item-et veszi fel a játékos,
		//majd használja is azt.
	    System.out.println("Válassza ki a futtatni kívánt szekvenciát\n" + 
	    				   "1. Player uses shovel\n" + 
	    				   "2. Player uses suit\n" +
	    				   "3. Player uses part\n" +
	    				   "4. Player uses rope\n" +
	    				   "5. Player eats food\n");
	    //Válasz beolvasása

	    int userInput;
	    do 
	    {
		    userInput = Main.scanner.nextInt();
		    //Majd az esetekre bontás
	    	switch (userInput)
	    	{
	    		case 1:
	    			i = new Shovel();
	    			break;
	    		case 2:
	    			i = new Suit();
					break;
	    		case 3:
	    			i = new Part();
	    			break;
	    		case 4:
	    			i = new Rope();
	    			break;
	    		case 5:
	    			i = new Food();
	    			break;
	    		default:
	    			System.out.println("Rossz input!");
	    			break;
	    	}
	    } while (userInput < 1 || userInput > 5);
	    useItem(i);
	}
}
