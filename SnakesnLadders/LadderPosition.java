public class LadderPosition
{
	private int startposition;
	private int endingposition;
	public LadderPosition(int st,int end) {
		this.startposition=st;
		this.endingposition=end;
	}
	public int getLadderStartPosition()	{
		return startposition;
	}
	public int getLadderEndPosition() {
		return endingposition;
	}
	public String toString() {
		String s=startposition+" ";
		s= s+endingposition;
		return s;
	}
}
