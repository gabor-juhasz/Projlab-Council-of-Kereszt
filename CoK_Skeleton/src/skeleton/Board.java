package skeleton;

import java.io.File;

public class Board {
	
	public void initBoard(File setup) { 
		//Létrehozza a játékteret és elemeit
		System.out.println("Board.initBoard()");
		String tiles = new String();
		String items = new String();
		String pieces = new String();
		
		//Meghívja a létrehozó függvényeket
		createTiles(tiles);
		generateItem(items);
		spawnPieces(pieces);
	}
	
	public void createTiles(String tiles) { 
		//Legenerálja a tileokat
		System.out.println("Board.createTiles()");
		System.out.println("<<create>> tiles");
	}
	
	public void generateItem(String items) { 
		//Legenerálja a tileokba az itemeket
		System.out.println("Board.generateItem()");
		Ice ice = new Ice();
		Item item = new Food();
		
		System.out.println("<<create>> items");
		ice.setItem(item);
		
	}
	
	public void spawnPieces(String pieces) { 
		//Végül a bábukat legeneráljuk a pályára
		System.out.println("Board.spawnPieces()");
		System.out.println("<<create>> pieces");
	}	
}
