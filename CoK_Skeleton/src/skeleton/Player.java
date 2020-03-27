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
	
	public void pickUpItem(Item i) {
		System.out.println("Player.pickUpItem()");
	}
}
