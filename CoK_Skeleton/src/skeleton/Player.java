package skeleton;
import java.util.*;

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
		System.out.println("Player.useItem()");
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
	
	public void pickUpItem(Item i) {
		System.out.println("Player.pickUpItem()");
	}
}
