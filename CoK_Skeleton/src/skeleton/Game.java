package skeleton;

public class Game implements EndGameListner {
	
	public void startGame() { 
		System.out.println("Game.startGame()");
	}
	
	public void endGame(boolean win) {
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Game.endGame()");
	}
	
	public void notifyPlayerDied(Piece p) { 
		System.out.println("Game.notifyPlayerDied()");
	}
	
	public void notifyWin() { 
		//�rtes�t�s a f�ggv�ny megh�v�s�r�l
		System.out.println("Game.notifyWin()");
		
		//F�ggv�ny h�v�sok
		this.endGame(true);
	}
	
	public void snowStorm() {
		System.out.println("Game.snowStorm()");
	}
}
