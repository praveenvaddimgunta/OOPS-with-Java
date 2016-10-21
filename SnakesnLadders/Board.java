import java.util.*;
public class Board
{
	ArrayList game;
	ArrayList<LadderPosition>ladders;
	ArrayList<SnakePosition>snakes;
	ArrayList<Player>players;
	int count=0;
	int count1=0;
	Player winner=new Player();

	public Board() {
		game=new ArrayList();
		ladders=new ArrayList<LadderPosition>();
		snakes=new ArrayList<SnakePosition>();
		players=new ArrayList<Player>();
		for(int i=0;i<100;i++) {
			game.add(i+1);
		}
	}

	public boolean addLadder(int startposition,int endposition)	{
		boolean flag=false;
		if(count<=7) {
			for(int i=0;i<snakes.size();i++) {
				if(startposition<endposition&&snakes.get(i).getSnakeStartPosition()!=startposition&&snakes.get(i).getSnakeEndPosition()!=endposition) {
					LadderPosition obj=new LadderPosition(startposition,endposition);
					count++;
					ladders.add(obj);
					flag=true;
					}
				}
			}
			
		else 
			flag=false;
		return flag;
		}

	public boolean addSnake(int start,int ending) {
		boolean f=false;
		if(count1<=7) {
			if(start>ending) {
				for(int i=0;i<ladders.size();i++) {
					if(ladders.get(i).getLadderStartPosition()!=start&&ladders.get(i).getLadderEndPosition()!=ending) {
					SnakePosition obj1=new SnakePosition(start,ending);
					snakes.add(obj1);
					count++;
					f=true;
					break;
					}
				}
			}
		}
		else 
			f=false;
		return f;
	}

	public void addPlayer(Player p) {
		players.add(p);
	}

	public void startGame()	{
		int i=0;
		int s=0;
		int d = 0;int win=0;
		if(players.size()>2&&(snakes.size()<=7||snakes.size()>=5)&&(ladders.size()<=7||ladders.size()>=5)) {
			//System.out.println(players);
			do {
		 	for( i=0;i<players.size();i++) {
			 	int p=Dice.roll();
			 	s=players.get(i).getPosition();
			 	d=players.get(i).getPosition()+p;
			 	//System.out.println(d);
			 	players.get(i).setPosition(d);
				for(int k=0;k<ladders.size();k++)
				{
					if(d==ladders.get(i).getLadderStartPosition()) 
						players.get(i).setPosition(ladders.get(i).getLadderEndPosition());
				}
				for(int j=0;j<snakes.size();j++) {
					if(d==snakes.get(i).getSnakeStartPosition())
						players.get(i).setPosition(snakes.get(i).getSnakeEndPosition());
				}
				if(players.get(i).getPosition()>100)
					players.get(i).setPosition(s);
			 	if(players.get(i).getPosition()==100) {
					winner=players.get(i);
					//System.out.println(players);					
				}
				 win= players.get(i).getPosition();
				 }
			}while(win<100);
		}
	}
	public Player getWinner() {
		return winner;
	}
}