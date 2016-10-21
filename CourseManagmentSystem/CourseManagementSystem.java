import java.util.*;

public class CourseManagementSystem {
	private String title;
	public ArrayList<Student> studentArray;
	public ArrayList<Course> courseArray;
	public static ArrayList<Enrollment> enrollArray = new ArrayList<Enrollment>();
	public static int j=0;

	public CourseManagementSystem(String title)
	{
		this.title = title;
		studentArray = new ArrayList<Student>();
		courseArray = new ArrayList<Course>();
	}
	public void addStudent(Student s) {
		studentArray.add(s);
	}
	public void addCourse(Course c)	{
		courseArray.add(c);
	}
	public void enroll(Student s, Course[] c) {
		for(int i=0; i<c.length;i++) {
			Enrollment enrol = new Enrollment(s, c[i]);
			enrollArray.add(enrol);
		}
	}
	public Enrollment[] getEnrollments() {
		Enrollment[] eArray= enrollArray.toArray(new Enrollment[enrollArray.size()]);
		return eArray;
	}
	public void awardGrade(Student s, Course c, int grade) {
		//Enrollment en = new Enrollment(Student s, Course c, Double grade);

		for(int i=0; i<enrollArray.size();i++) {
			if(enrollArray.get(i).getStudentName().equals(s) && enrollArray.get(i).getCoursesEnroll().equals(c)) {
				enrollArray.get(i).setgrades(grade);
				//System.out.println(enrollArray.get(i).setgrades(grade));
				break;
			}
		}
	}
	public void computeGPA() {
		Double numerator, denominator;
		for(int i=0; i < studentArray.size(); i++) {
			numerator = 0.0;
			denominator = 0.0;
			for(int j=0; j<enrollArray.size(); j++) {
				if(studentArray.get(i).equals(enrollArray.get(j).getStudentName())){
					//System.out.println(enrollArray.get(j).getgrades());
					numerator = numerator + (enrollArray.get(j).getCoursesEnroll().getCreditPoints()*enrollArray.get(j).getgrades());
					denominator = denominator + enrollArray.get(j).getCoursesEnroll().getCreditPoints();
					//System.out.println(numerator);
					//System.out.println(denominator);
				}
			}
			double result = numerator/denominator;
			double result1 = Math.round( result * 100.0 ) / 100.0;
			studentArray.get(i).setGPA(result1);
			//System.out.println(denominator);
		}
	}
	public String generateTranscript(Student s) {
		String str = s.getStudentName() + " has enrolled in " + courseArray.size() + " courses and obtained following grades:\n";
		for (int i = 0; i<courseArray.size(); i++) {
			str = str + enrollArray.get(i).getCoursesEnroll().getCourseName() + "-" + enrollArray.get(j++).getgrades() + "\n";
		}
		str = str + "GPA is :" + s.getGPA();
		return str;
	}
}