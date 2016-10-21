import java.util.*;
import java.io.*;
public class Quiz {
	public static void main(String[] args) {
		int choice;
		Scanner s = new Scanner(System.in);
		Question qobj = new Question();
		do {
		System.out.println("1.question paper");
		System.out.println("2.quiz");
		System.out.println("3.result");
		System.out.println("Enter your choice: ");
		
		choice = s.nextInt();
		switch(choice) {
			case 1:
			System.out.println("Enter question number: ");
			int qno = s.nextInt();
			String a=s.nextLine();
			System.out.println("Enter Question: ");
			String ques = s.nextLine();
			System.out.println("option 1:");
			String opt1 = s.nextLine();
			System.out.println("option 2:");
			String opt2 = s.nextLine();
			System.out.println("option 3:");
			String opt3 = s.nextLine();
			System.out.println("option 4:");
			String opt4 = s.nextLine();
			System.out.println("Correct answer :");
			String ans = s.nextLine();
			System.out.println("Grade points :");
			int points = s.nextInt();
			Paper obj = new Paper(qno, ques, opt1, opt2, opt3, opt4, ans, points); 
			qobj.addQuestion(obj);
			break;
			case 2:
			//System.out.println("2"); 
			qobj.quiz();
			break;
			case 3:
			//System.out.println("3"); 
			qobj.result();
			break;
			default:
			System.out.println("enter valid choice");
			break;
		}
		}while(choice<=3);
	}
	
}