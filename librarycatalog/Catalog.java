import java.util.*;
public class Catalog {
	ArrayList<Card> titleArray;
	public Catalog() {
		titleArray=new ArrayList<Card>();
	}
	public void addACard(Card c) {
		titleArray.add(c);
	}
	public void getATitle(String s) {
		for(int i=0;i<titleArray.size();i++) {
			if(titleArray.get(i).getTitle().equals(s)) {
				System.out.println(titleArray.get(i).getTitle());
				System.out.println(titleArray.get(i).getAuthor());
				System.out.println(titleArray.get(i).getSubject());
			}
		}
	}
	public void getAAuthor(String s) {
		for(int j=0;j<titleArray.size();j++) {
			if(titleArray.get(j).getAuthor().equals(s)) {
				System.out.println(titleArray.get(j).getTitle());
				System.out.println(titleArray.get(j).getAuthor());
				System.out.println(titleArray.get(j).getSubject());
			}
		}
	}
	public void getASubject(String su) {
		for(int g=0;g<titleArray.size();g++) {
			if(titleArray.get(g).getSubject().equals(su)) {
				System.out.println(titleArray.get(g).getTitle());
				System.out.println(titleArray.get(g).getAuthor());
				System.out.println(titleArray.get(g).getSubject());
			}
		}
	}
	public void removeBook(String s) {
		for(int i=0;i<titleArray.size();i++) {
			if(titleArray.get(i).getTitle().equals(s)) {
				titleArray.remove(i);
			}
		}
	}
	public void printTitleCatalog() {
		for(int i=0;i<titleArray.size();i++) {
			for (int j=i+1;j<titleArray.size();j++ ) {
				if(titleArray.get(i).getTitle().compareTo(titleArray.get(j).getTitle())>0) {
					Card temp=new Card();
					temp=titleArray.get(j);
					titleArray.set(j,titleArray.get(i));
					titleArray.set(i,temp);
				}
			}
		}
		for(int k=0;k<titleArray.size();k++) {
			System.out.println(titleArray.get(k).getTitle());
			System.out.println(titleArray.get(k).getAuthor());
			System.out.println(titleArray.get(k).getSubject());
		}
	}
	public void printAuthorCatalog() {
		for(int i=0;i<titleArray.size();i++) {
			for (int j=i+1;j<titleArray.size();j++ ) {
				if(titleArray.get(i).getAuthor().compareTo(titleArray.get(j).getAuthor())>0) {
					Card temp=new Card();
					temp=titleArray.get(j);
					titleArray.set(j,titleArray.get(i));
					titleArray.set(i,temp);
				}
			}
		}
		for(int k=0;k<titleArray.size();k++) {
			System.out.println(titleArray.get(k).getAuthor());
			System.out.println(titleArray.get(k).getTitle());
			System.out.println(titleArray.get(k).getSubject());
		}
	}
	public void printSubjectCatalog() {
		for(int i=0;i<titleArray.size();i++) {
			for (int j=i+1;j<titleArray.size();j++ ) {
				if(titleArray.get(i).getSubject().compareTo(titleArray.get(j).getSubject())>0) {
					Card temp=new Card();
					temp=titleArray.get(j);
					titleArray.set(j,titleArray.get(i));
					titleArray.set(i,temp);
				}
			}
		}
		for(int k=0;k<titleArray.size();k++) {
			System.out.println(titleArray.get(k).getSubject());
			System.out.println(titleArray.get(k).getTitle());
			System.out.println(titleArray.get(k).getAuthor());
		}
	}
} 