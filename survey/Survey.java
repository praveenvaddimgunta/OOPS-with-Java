import java.lang.*;
import java.util.*;
public class Survey{
	ArrayList<Person> per;
	public Survey(){
	 per = new ArrayList<Person>();
    }
	//int s=0;
	
	String ques[] ={"Difficulty level for sub1?","Difficulty level for sub2?","Difficulty level for sub3?","Difficulty level for sub4?","Difficulty level for sub5?","Difficulty level for sub6?","Difficulty level for sub7?","Difficulty level for sub8?","Difficulty level for sub9?","Difficulty level for sub10?"};
	
	
	public void toPrint(){
		if(per.size()==0){
			System.out.println("1) Take Survey ");
			System.out.println("2) Summary ");
			System.out.println("exit");

		}
		else{
			System.out.println("1) Take Survey ");
			System.out.println("2) Summary ");
			for(int j=0;j<per.size();j++){
				System.out.println(""+(j+3)+") "+per.get(j).getName());
			}
			System.out.println("exit");
			System.out.println("select an option");
		}
	}
	public void takeSurvey(){
			String st="";
			int j=0;
			int i=0;
			System.out.println("Enter Name");
			Scanner sc =new Scanner(System.in);
			st=sc.nextLine();
			Person p=new Person(st);
        	System.out.println("Opt between 1 to 5");
        	for(i=0;i<10;i++){
        		System.out.println(ques[i]);
        		st=sc.nextLine();
                j=Integer.parseInt(st);
                p.setoptionAns(i+1,j);
            }
            
        	per.add(p);
        	

            
		}

		public void toSummary(){
			double[] avg = new double[10];
			int u=0;
			int v=0;
			double f=0.00;
			
			for(int x=1;x<11;x++){
				for(int z=0;z<per.size();z++){
						Person ps = per.get(z);
						u=u+ps.getoptionAns(x);
						//System.out.println(u);
				}
				//System.out.println(per.size());
				f=(double)u/per.size();
				avg[v]=f;
				//System.out.println(avg[v]);
				v++;
				u=0;
			}
			for(int k=0;k<10;k++){
				System.out.printf("%.2f\n",avg[k]);
			}
			

		}

		public void toDetails(int t){
			int k=1;
			//int j=
			for(int i=0;i<10;i++){
			System.out.println("Question-"+(i+1));
			System.out.println(per.get(t).getoptionAns(i+1));
		   }
		}
}