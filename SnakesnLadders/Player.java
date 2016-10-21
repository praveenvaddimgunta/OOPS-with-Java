public class Player
{
	private String playerName;
	private int position;
	private String winner;
	public Player()	{

	}
	public Player(String playerName) {
		this.playerName=playerName;
		this.position=1;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPosition(int p) {
		this.position=p;
	}
	public int getPosition() {
		return position;
	}
	public void setWinner(String s)	{
		this.winner=s;
	}
	public String getWinner() {
		return winner;
	}
	public String toString() {
		String s=playerName + " at " +position;
		return s;
	}
}
