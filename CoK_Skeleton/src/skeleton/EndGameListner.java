package skeleton;

public interface EndGameListner {
	//Listener ami a játék végét figyeli
	
	//Értesít, ha egy player meghalt
	public void notifyPlayerDied(Piece p);
	
	//Értesít, ha megnyertük a játékot
	public void notifyWin();
}
