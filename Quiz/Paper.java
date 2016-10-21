public class Paper {
	public int qno;
	public String ques;
	public String opt1;
	public String opt2;
	public String opt3;
	public String opt4;
	public String ans;
	public int points;

	public Paper(int qno, String ques, String opt1, String opt2, String opt3, String opt4, String ans, int points) {
		this.qno = qno;
		this.ques = ques;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.ans = ans;
		this.points = points;
	}

}