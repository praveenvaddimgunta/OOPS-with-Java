import java.io.*;
import java.util.*;
public class Leaderboard {

	private Player[] players;
	private Game[] game;
	private void readInput(String file)  throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = null;
		String txt = "";
		while ((line = br.readLine()) != null) {
			txt = txt + line + "\n";
		}
		//System.out.println(txt);
		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> games = new ArrayList<>();
		int index = 0;
		br.close();
		StringTokenizer st = new StringTokenizer(txt,"\n");
		while(st.hasMoreTokens()) {
			String temp = st.nextToken(); 
			if(temp.charAt(0) == '/'){
				index = index + 1;
				continue;
			}
			if(index == 1){
				names.add(temp);
			} else if(index == 2){
				games.add(temp);
			}
		}
	
		players = new Player[names.size()];
		game = new Game[games.size()];
		for(int i =0; i<names.size();i++){
			Player object = new Player();
			object.setName(names.get(i));
			players[i] = object;
		}
		for(int j=0; j<games.size(); j++) {
			String temp = games.get(j);
			String gameId = "";
			int points = 0;
			String p1 = "";
			String p2 = "";
			String winner = "tie";
			StringTokenizer st1 = new StringTokenizer(temp," ");
			while(st1.hasMoreTokens()){
				gameId = st1.nextToken();
				p1 = st1.nextToken();
				p2 = st1.nextToken();
				points = Integer.parseInt(st1.nextToken());
				if(p1.charAt(p1.length()-1) == '*')
					winner = p1.substring(0,p1.length()-1);
				else if(p2.charAt(p2.length()-1) == '*')
					winner = p2.substring(0,p2.length()-1);
				else
					winner = "tie";
			}
			Game object1 = new Game(gameId,p1,p2,points,winner);
				game[j] = object1; 

		}
	}
	public Leaderboard(String file) throws IOException {
		readInput(file);
	}

	public void printLeaderboard() {
		for(int i = 0; i<game.length; i++){
			for(int j = 0 ; j <players.length; j++) {
				if(game[i].getWinner().equals(players[j].getName())){
					players[j].setPoints(game[i].getPPoints());
				} else if(game[i].getWinner().equals("tie")){
							if(game[i].getP1().equals(players[j].getName())){
								players[j].setPoints(game[i].getPPoints()/2);
								}
							else if(game[i].getP2().equals(players[j].getName())){
								players[j].setPoints(game[i].getPPoints()/2);
								}
				}
			}
		}
		
		Player swap;
		for (int c = 0; c < players.length; c++) {
      for (int d = 0; d < players.length - 1; d++) {
        if (players[d].getPoints() < players[d+1].getPoints()) /* For descending order use < */
        {
          swap       = players[d];
          players[d]   = players[d+1];
          players[d+1] = swap;
        }
      }
    }
    for(int x = 0; x<players.length; x++){
			System.out.println(players[x].getName() + "-" + players[x].getPoints());
		}
	}

	public static void main(String[] args) throws IOException {
		String file = args[0]; 
		Leaderboard object = new Leaderboard(file);
		object.printLeaderboard();
	}
}

class Player {
	public String name = "";
	public int points = 0;
	public Player() {
		this.name = "";
		this.points = 0;
	}
	public Player(String name, int points) {
		this.name = name;
		this.points = points;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setPoints(int points){
		this.points = this.points + points;
	}
	public int getPoints(){
		return points;
	}
}

class Game {
	public String gameID = "";
	public String p1 = "";
	public String p2 = "";
	public int game_points = 0;
	public String  winner= "";
	public Game() {
		this.gameID = "";
		this.p1 = "";
		this.p2 = "";
		this.game_points = 0;
		this.winner= "";
	}
	public Game(String gameID,String player1,String player2,int points, String winner){
		this.gameID = gameID;
		this.p1 = player1;
		this.p2 = player2;
		this.game_points = points;
		this.winner= winner;		
	}
	public String getP1(){
		return this.p1;
	}
	public String getP2(){
		return this.p2;
	}
	public int getPPoints() {
		return this.game_points;
	}
	public String getWinner() {
		return this.winner;
	}
}