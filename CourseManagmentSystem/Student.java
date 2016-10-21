public class Student {
	private String studentName;
	private Double gpa;

	public Student(String studentName) {
		this.studentName = studentName;
		this.gpa = 0.0;
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName() {
		this.studentName = studentName;
	}
	public Double getGPA() {
		return gpa;
	}
	public void setGPA(double gpa) {
		this.gpa=gpa;
	}
}