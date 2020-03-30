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
		//A j�t�kos haszn�lja a b�buj�n�l lev� itemet
		System.out.println("Player.useItem()");
		//Lok�lis v�ltoz�nak l�trehozunk egy b�but
		Piece eskimoPiece = new Eskimo();
		
		//Majd megh�vjuk a b�bu useItem f�ggv�ny�t
		eskimoPiece.useItem(i);
	}
	
	public void useAbility(Tile t) {
		System.out.println("Player.useAbility()");
		
		//Mivel 2 szekvencia is ezzel a f�ggv�nnyel kezd�dik, ez�rt meg kell k�rdezni, hogy melyik szekvenci�t akarjuk lefuttatni
		System.out.println("V�lassza ki a futtatni k�v�nt szekvenci�t");
		System.out.println("1. Explorer checks capacity");
		System.out.println("2. Eskimo builds igloo");
		
		//V�lasz beolvas�sa
		int userInput;

		do {
			userInput = Main.scanner.nextInt();
			
			if(userInput == 1) {
				Explorer explorer = new Explorer();	//Ha az els�t v�lasztjuk, akkor az Explorer ability f�ggv�ny�t h�vjuk meg
				explorer.ability(t);
			}
			else if(userInput == 2){
				Eskimo eskimo = new Eskimo();	//Ha a m�sodikat v�lasztjuk, akkor az Eskimo ability f�ggv�ny�t h�vjuk meg
				eskimo.ability(t);
			}
			else System.out.println("Rossz input!");
		} while (userInput < 1 || userInput > 2);
	}
	
	public void pickUpItem(Tile t) {
		//A j�t�kot felveszi a t�rgyat
		System.out.println("Player.pickUpItem()");
		Ice ice = new Ice();
		Piece eskimoPiece = new Eskimo();
		
		//El�sz�r lek�rj�k, hogy azon a mez�n a j�t�kos b�buja van, mennyi h� van.
		ice.getSnow();
		//Majd mivel nincs h� rajta, felvessz�k a t�rgyat
		Item i = ice.getItem();
		//�s hozz�adjuk a b�buhoz
		eskimoPiece.addItem(i);
		
		//El�gaz�s, itt a felhaszn�l� kiv�laszthatja, hogy mely szekvenci�t szeretn� a tov�bbiakban futtatni
		//Ezzel l�nyeg�ben azt szimul�ljuk, hogy a kiv�lasztott t�pus� item-et veszi fel a j�t�kos,
		//majd haszn�lja is azt.
	    System.out.println("V�lassza ki a futtatni k�v�nt szekvenci�t\n" + 
	    				   "1. Player uses shovel\n" + 
	    				   "2. Player uses suit\n" +
	    				   "3. Player uses part\n" +
	    				   "4. Player uses rope\n" +
	    				   "5. Player eats food\n");
	    //V�lasz beolvas�sa

	    int userInput;
	    do 
	    {
		    userInput = Main.scanner.nextInt();
		    //Majd az esetekre bont�s
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
