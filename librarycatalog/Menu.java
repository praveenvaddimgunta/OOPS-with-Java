import java.util.*;
public class Menu {
	public static void main(String args[]) {
		int option;
		String author,title,subject;
		Scanner s=new Scanner(System.in);
		Catalog obj=new Catalog();
		do {
			System.out.println("1:print the catalog \n 2:Add book  \n 3:Remove book \n 4:Get a title \n 5.Get author \n 6.Get subject \n 7.Exit ");
			System.out.println("Enter your choice");
			option=s.nextInt();
			switch(option) {
				case 1:
				System.out.println("1. print using title \n 2.print using author \n 3.print using subject \n");
				System.out.println("enter your choice:");
				Scanner n=new Scanner(System.in);
				int opt=n.nextInt();
				if(opt==1)
					obj.printTitleCatalog();
				else if(opt==2)
					obj.printAuthorCatalog();
				else if(opt==3)
					obj.printSubjectCatalog();
				else 
					System.out.println("enter valid choice");
				break;
				case 2:
				System.out.println("Enter title name=");
				Scanner d=new Scanner(System.in);
				title=d.nextLine();
				System.out.println("Enter author name=");
				author=d.nextLine();
				System.out.println("Enter subject name=");
				subject=d.nextLine();
				Card c=new Card(title,author,subject);
				obj.addACard(c);
				break;
				case 3:
				System.out.println("enter title of book:");
				Scanner f=new Scanner(System.in);
				String l=f.nextLine();
				obj.removeBook(l);
				break;
				case 4:
				System.out.println("Enter title Name");
				Scanner o=new Scanner(System.in);
				String  t=o.nextLine();
				obj.getATitle(t);
				break;
				case 5:
				System.out.println("Enter author name");
				Scanner r=new Scanner(System.in);
				String a=r.nextLine();
				obj.getAAuthor(a);
				break;
				case 6:
				System.out.println("Enter subject name:");
				Scanner ts=new Scanner(System.in);
				String sub=ts.nextLine();
				obj.getASubject(sub);
				break;
				default:
				break;
			}
		}while(option<7);
	}
}