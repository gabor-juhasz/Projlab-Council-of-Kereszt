package skeleton;

public class Game implements EndGameListner {
	
	public void startGame() { 
		System.out.println("startGame");
	}
	
	public void endGame(boolean win) {
		System.out.println("endGame");
	}
	
	public void notifyPlayerDied(Piece p) { 
		System.out.println("notifyPlayerDied");
	}
	
	public void notifyWin() { 
		System.out.println("notifyWin");
	}
	
	public void snowStorm() {
		System.out.println("snowStorm");
	}
}
