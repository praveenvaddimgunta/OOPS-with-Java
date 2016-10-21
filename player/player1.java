import java.util.*;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Comparator;

class Player1 {
	static ArrayList<Player> players;
	String []word;
	Player1() {
		players = new ArrayList<Player>();
		word   = new String[50];

	}
	public static void main(String[] args) throws Exception {
		
		Player1 play = new Player1();
		Player p1 = new Player();
		Player p;

		BufferedReader in=new BufferedReader(new FileReader("Players.csv"));

		String str =  in.readLine();
		while(str != null) {
		String word[]  =  str.split(",");
		p = new Player(word[0],Integer.parseInt(word[1]),Integer.parseInt(word[2]),Integer.parseInt(word[3]));
        players.add(p);
        str =  in.readLine();
        }
        for(int i = 0 ;i < players.size();i++) {
            System.out.println(players.get(i));
        }
        Collections.sort(players,new Player());
        for(int i=0; i<players.size();i++)
        System.out.println(players.get(i));
    }
}
		
		




	
	
