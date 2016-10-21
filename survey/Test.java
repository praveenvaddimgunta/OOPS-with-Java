import java.util.*;
import java.lang.*;
public class Test{
	public static void main(String[] args){
		Survey obje=new Survey();
		obje.toPrint();
		// if(obje.per.size()==0){
		// 	System.out.println("1) Take Survey ");
		// 	System.out.println("2) Summary ");
		// 	System.out.println("exit");

		// }
		// else{
		// 	System.out.println("1) Take Survey ");
		// 	System.out.println("2) Summary ");
		// 	for(int j=0;j<obje.per.size();j++){
		// 		System.out.println(""+(j+3)+") "+obje.per.get(j).getName());
		// 	}
		// 	System.out.println("exit");
		// 	System.out.println("select an option");
		// }
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		
		
		while(!str.equals("exit")){
			
			int t=Integer.parseInt(str);
		if(t==1)
			obje.takeSurvey();

		else if(t==2)
			obje.toSummary();
		 else 
			obje.toDetails(t-3);
		obje.toPrint();
        str=sc.nextLine();
	   }

	}
}