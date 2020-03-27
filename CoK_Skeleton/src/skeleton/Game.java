package skeleton;

public class Game implements EndGameListner {
	
	public void startGame() { 
		System.out.println("Game.startGame()");
	}
	
	public void endGame(boolean win) {
		System.out.println("Game.endGame()");
	}
	
	public void notifyPlayerDied(Piece p) { 
		System.out.println("Game.notifyPlayerDied()");
	}
	
	public void notifyWin() { 
		System.out.println("Game.notifyWin()");
	}
	
	public void snowStorm() {
		System.out.println("Game.snowStorm()");
	}
}
