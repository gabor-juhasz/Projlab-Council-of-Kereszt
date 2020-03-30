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
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Player.useItem()");
		//Lok�lis v�ltoz�k l�trehoz�sa
		Piece eskimoPiece = new Eskimo();
		
		//F�ggv�ny h�v�sok
		eskimoPiece.useItem(i);
	}
	
	public void useAbility(Tile t) {
		System.out.println("Player.useAbility()");
		
		//Mivel 2 szekvencia is ezzel a f�ggv�nnyel kezd�dik, ez�rt meg kell k�rdezni, hogy melyik szekvenci�t akarjuk lefuttatni
		System.out.println("V�lassza ki a futtatni k�v�nt szekvenci�t");
		System.out.println("1. Explorer checks capacity");
		System.out.println("2. Eskimo builds igloo");
		
		//V�lasz beolvas�sa
		Scanner scr = new Scanner(System.in);
		int i = scr.nextInt();
		scr.close();
		
		if(i == 1) {
			Explorer exp = new Explorer();	//Ha az els�t v�lasztjuk, akkor az Explorer ability f�ggv�ny�t h�vjuk meg
			exp.ability(t);
		}
		else {
			Eskimo esk = new Eskimo();	//Ha a m�sodikat v�lasztjuk, akkor az Eskimo ability f�ggv�ny�t h�vjuk meg
			esk.ability(t);
		}

		
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
	    //V�lasz beolvas�sa
	    int userInput;
	    do 
	    {
	    	userInput = scanner.nextInt();
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
	    } while (userInput < 1 || userInput > 6);
	    scanner.close();
	    useItem(i);
	}
}
