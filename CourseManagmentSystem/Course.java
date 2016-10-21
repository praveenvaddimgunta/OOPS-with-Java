public class Course {
	private String courseName;
	private int creditPoints;

	public Course(String courseName, int creditPoints) {
		this.courseName = courseName;
		this.creditPoints = creditPoints;
	}

	public String getCourseName() {
		return courseName;
	}
	public void setCourseName() {
		this.courseName = courseName;
	}
	public int getCreditPoints() {
		return creditPoints;
	}
	public void setCreditPoints() {
		this.creditPoints = creditPoints;
	}

	public String tostring() {
		String s = courseName + "";
		s= s + creditPoints;
		return s;
	}
}