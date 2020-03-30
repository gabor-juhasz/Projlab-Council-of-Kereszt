package skeleton;

import java.io.File;

public class Game implements EndGameListner {
	
	public void startGame() { 
		//értesítés a fv meghívásáról
		System.out.println("Game.startGame()");
		//lokális változók létrehozása
		String s = new String("path.txt");
		File setup = new File(s);
		Board b = new Board();
		
		//függvény hívások
		this.readFile(s);
		b.initBoard(setup);
	}
	
	public void endGame(boolean win) {
		//Véget ér a játék
		System.out.println("Game.endGame()");
	}
	
	public void notifyPlayerDied(Piece p) { 
		System.out.println("Game.notifyPlayerDied()");
		
		this.endGame(false);
	}
	
	public void notifyWin() { 
		//Megnyerjük a játékot
		System.out.println("Game.notifyWin()");
		
		//Ezzel véget ér a játék
		this.endGame(true);
	}
	
	public void readFile(String s) {
		System.out.println("Game.readFile()");
	}
	
	public void snowStorm() {
		System.out.println("Game.snowStorm()");
		Tile tile = new Tile();
		Piece piece = new Eskimo();
		
		tile.addSnow();
		piece.decBodyTemp();
	}
}
