public class SnakePosition
{
	private int startposition;
	private int endingposition;
	public SnakePosition(int st,int end) {
		this.startposition=st;
		this.endingposition=end;
	}
	public int getSnakeStartPosition() {
		return startposition;
	}
	public int getSnakeEndPosition() {
		return endingposition;
	}
	public String toString() {
		String s=startposition+" ";
		s= s+endingposition;
		return s;
	}
}
