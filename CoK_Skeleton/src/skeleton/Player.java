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
		
		//Mivel 2 szekvencia is ezzel a függvénnyel kezdõdik, ezért meg kell kérdezni, hogy melyik szekvenciát akarjuk lefuttatni
		System.out.println("Válassza ki a futtatni kívánt szekvenciát");
		System.out.println("1. Explorer uses ability");
		System.out.println("2. Player builds igloo");
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
	
	public void pickUpItem(Item i) {
		System.out.println("Player.pickUpItem()");
	}
}
