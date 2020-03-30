package skeleton;

import java.io.File;

public class Game implements EndGameListner {
	
	public void startGame() { 
		//Értesítés a fv meghívásáról
		System.out.println("Game.startGame()");
		//Lokális változók létrehozása
		String s = new String("path.txt");
		File setup = new File(s);
		Board b = new Board();
		
		//Függvény hívások
		this.readFile(s);
		b.initBoard(setup);
	}
	
	public void endGame(boolean win) {
		//Véget ér a játék
		System.out.println("Game.endGame()");
	}
	
	public void notifyPlayerDied(Piece p) { 
		//Így értesül a játék egy bábu haláláról
		System.out.println("Game.notifyPlayerDied()");
		
		this.endGame(false);
	}
	
	public void notifyWin() { 
		//Így értesül a játék a cél elérésérõl
		System.out.println("Game.notifyWin()");
		
		//Ezzel véget ér a játék
		this.endGame(true);
	}
	
	public void readFile(String s) {
		//A pálya elrendezésérõl szóló txt beolvasása
		System.out.println("Game.readFile()");
	}
	
	public void snowStorm() {
		System.out.println("Game.snowStorm()");
		Tile tile = new Tile();
		Piece piece = new Eskimo();
		
		//Minden jégtáblára kerül egy réteg hó
		tile.addSnow();
		//Minden játékos veszít egy testhõt
		piece.decBodyTemp();
	}
}
