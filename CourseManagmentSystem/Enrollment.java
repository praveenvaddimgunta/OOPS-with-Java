public class Enrollment
{
	private Student studentName;
	private Course coursesEnroll;
	private int grades=0;

	public Enrollment(Student studentName, Course coursesEnroll) {
		this.studentName = studentName;
		this.coursesEnroll = coursesEnroll;
	}

	//public Boolean equals(Enrollment e) {
	//	if(this.studentName.equals(e.studentName) && this.)
	//}

	public Student getStudentName() {
		return studentName;
	}
	public Course getCoursesEnroll() {
		return coursesEnroll;
	}
	public int getgrades() {
		return grades;
	}
	public void setgrades(int grade) {
		this.grades = grade;
		//System.out.println(this.grades);
	}
}