package skeleton;

import java.io.File;

public class Board {
	
	public void initBoard(File setup) { 
		//L�trehozza a j�t�kteret �s elemeit
		System.out.println("Board.initBoard()");
		String tiles = new String();
		String items = new String();
		String pieces = new String();
		
		//Megh�vja a l�trehoz� f�ggv�nyeket
		createTiles(tiles);
		generateItem(items);
		spawnPieces(pieces);
	}
	
	public void createTiles(String tiles) { 
		//Legener�lja a tileokat
		System.out.println("Board.createTiles()");
		System.out.println("<<create>> tiles");
	}
	
	public void generateItem(String items) { 
		//Legener�lja a tileokba az itemeket
		System.out.println("Board.generateItem()");
		Ice ice = new Ice();
		Item item = new Food();
		
		System.out.println("<<create>> items");
		ice.setItem(item);
		
	}
	
	public void spawnPieces(String pieces) { 
		//V�g�l a b�bukat legener�ljuk a p�ly�ra
		System.out.println("Board.spawnPieces()");
		System.out.println("<<create>> pieces");
	}	
}
