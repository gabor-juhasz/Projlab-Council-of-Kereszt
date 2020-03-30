package skeleton;

import java.io.File;

public class Game implements EndGameListner {
	
	public void startGame() { 
		//�rtes�t�s a fv megh�v�s�r�l
		System.out.println("Game.startGame()");
		//Lok�lis v�ltoz�k l�trehoz�sa
		String s = new String("path.txt");
		File setup = new File(s);
		Board b = new Board();
		
		//F�ggv�ny h�v�sok
		this.readFile(s);
		b.initBoard(setup);
	}
	
	public void endGame(boolean win) {
		//V�get �r a j�t�k
		System.out.println("Game.endGame()");
	}
	
	public void notifyPlayerDied(Piece p) { 
		//�gy �rtes�l a j�t�k egy b�bu hal�l�r�l
		System.out.println("Game.notifyPlayerDied()");
		
		this.endGame(false);
	}
	
	public void notifyWin() { 
		//�gy �rtes�l a j�t�k a c�l el�r�s�r�l
		System.out.println("Game.notifyWin()");
		
		//Ezzel v�get �r a j�t�k
		this.endGame(true);
	}
	
	public void readFile(String s) {
		//A p�lya elrendez�s�r�l sz�l� txt beolvas�sa
		System.out.println("Game.readFile()");
	}
	
	public void snowStorm() {
		System.out.println("Game.snowStorm()");
		Tile tile = new Tile();
		Piece piece = new Eskimo();
		
		//Minden j�gt�bl�ra ker�l egy r�teg h�
		tile.addSnow();
		//Minden j�t�kos vesz�t egy testh�t
		piece.decBodyTemp();
	}
}
