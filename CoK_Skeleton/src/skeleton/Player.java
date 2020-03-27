package skeleton;
import java.util.*;

public class Player {
	
	public void move(Tile t) {
		System.out.println("Player.move()");
	}
	
	public void useItem(Item i) { 
		System.out.println("Player.useItem()");
	}
	
	public void useAbility(Tile t) {
		System.out.println("Player.useAbility()");
		
		//Mivel 2 szekvencia is ezzel a f�ggv�nnyel kezd�dik, ez�rt meg kell k�rdezni, hogy melyik szekvenci�t akarjuk lefuttatni
		System.out.println("V�lassza ki a futtatni k�v�nt szekvenci�t");
		System.out.println("1. Explorer uses ability");
		System.out.println("2. Player builds igloo");
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
	
	public void pickUpItem(Item i) {
		System.out.println("Player.pickUpItem()");
	}
}
