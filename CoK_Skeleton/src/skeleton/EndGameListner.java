package skeleton;

public interface EndGameListner {
	//Listener ami a j�t�k v�g�t figyeli
	
	//�rtes�t, ha egy player meghalt
	public void notifyPlayerDied(Piece p);
	
	//�rtes�t, ha megnyert�k a j�t�kot
	public void notifyWin();
}
