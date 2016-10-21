import java.util.*;
public class Question {
	ArrayList<Paper> exam;
	int score;
	public Question() {
		exam = new ArrayList<Paper>();
	}

	public void addQuestion(Paper obj) {
		exam.add(obj);
	}
	public void quiz() {
		System.out.println("enter number of questions: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(exam.get(i).qno);
			System.out.println(exam.get(i).ques);
			System.out.println(exam.get(i).opt1);
			System.out.println(exam.get(i).opt2);
			System.out.println(exam.get(i).opt3);
			System.out.println(exam.get(i).opt4);
			System.out.println("enter your answer :");
			Scanner s1 = new Scanner(System.in);
			String answer = s1.nextLine();
			if (exam.get(i).ans.equals(answer)) {
				System.out.println("grade points :");
				System.out.println(exam.get(i).points);
				score+= exam.get(i).points; 
			}
		}
	}
	public void result() {
		System.out.println("total score is :"+score);
		break;
	}
}