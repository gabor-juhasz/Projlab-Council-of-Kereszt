package skeleton;

import java.io.File;

public class Game implements EndGameListner {
	
	public void startGame() { 
		//�rtes�t�s a fv megh�v�s�r�l
		System.out.println("Game.startGame()");
		//lok�lis v�ltoz�k l�trehoz�sa
		String s = new String("path.txt");
		File setup = new File(s);
		Board b = new Board();
		
		//f�ggv�ny h�v�sok
		this.readFile(s);
		b.initBoard(setup);
	}
	
	public void endGame(boolean win) {
		//V�get �r a j�t�k
		System.out.println("Game.endGame()");
	}
	
	public void notifyPlayerDied(Piece p) { 
		System.out.println("Game.notifyPlayerDied()");
		
		this.endGame(false);
	}
	
	public void notifyWin() { 
		//Megnyerj�k a j�t�kot
		System.out.println("Game.notifyWin()");
		
		//Ezzel v�get �r a j�t�k
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
