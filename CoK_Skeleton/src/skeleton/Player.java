package skeleton;
import java.util.*;

import java.util.Scanner;

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
		Scanner scr = new Scanner(System.in);
		int i = scr.nextInt();
		scr.close();
		
		if(i == 1) {
			Explorer exp = new Explorer();	//Ha az elsõt választjuk, akkor az Explorer ability függvényét hívjuk meg
			exp.ability(t);
		}
		else {
			Eskimo esk = new Eskimo();	//Ha a másodikat választjuk, akkor az Eskimo ability függvényét hívjuk meg
			esk.ability(t);
		}

		
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
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Válassza ki a futtatni kívánt szekvenciát\n" + 
	    				   "1. Player uses shovel\n " + 
	    				   "2. Player uses suit\n" +
	    				   "3. Player uses part\n" +
	    				   "4. Player uses rope\n" +
	    				   "5. Player eats food\n");
	    //Válasz beolvasása
	    int userInput = scanner.nextInt();
	    //Majd az esetekre bontás
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
