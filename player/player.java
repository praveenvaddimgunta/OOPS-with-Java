 import java.util.Comparator;
 import java.util.*;
 class Player implements Comparator<Player>{
	String playerName;
	int  missFields;
	int runs;
	int catches;
	Player() {

	}

	Player(String playerName,int runs ,int catches,int missFields) {
		this.playerName = playerName;
		this.runs = runs;
		this.catches = catches;
		this.missFields= missFields;

	}

	void setName(String playerName) {
		this.playerName = playerName;
	}

	void setMissFields(int missFields) {
		this.missFields = missFields;
	}

	void setRuns(int runs) {
		this.runs = runs;
	}
	void setCatches(int catches) {
		this.catches = catches;
	}

	String getName() {
		return this.playerName;
	}

	int getMissFields() {
		return this.missFields;
	}

	int getRuns() {
		return this.runs;
	}

	int getCatches() {
	    return this.catches;
	}

	public String toString() {
		return this.getName() +" "+ this.getRuns()+" "+ this.getCatches() + " "  + " " + this.getMissFields() +" ";
	}
	public int compare(Player p1,Player p2) {
		//System.out.println("***************************");
        if(p1.getRuns() != p2.getRuns()) {
            return p2.getRuns() - p1.getRuns();//descending order
        	}
        	else if(p1.getMissFields() != p2.getMissFields()) {
        		return p1.getMissFields() - p2.getMissFields();
        	    }
        	    else if(p1.getCatches() != p2.getCatches()) {
        		     return p1.getCatches() - p2.getCatches();
        	    }
        	    else if(!(p1.getName()).equals( p2.getName())) {
        			return ((p1.getName()).compareTo( p2.getName()));
        		
        	    }
        	    else {
        		   return 0;
        	    }
    }
          
}