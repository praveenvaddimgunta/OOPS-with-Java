class BookShow {
	private Show[] shows;
	private final int size = 10;
    private int showcount;

	public BookShow() {
		shows = new Show[size];
		showcount = 0;
	}

	public void addShows(Show s) {
		if (showcount < size)
		  shows[showcount++] = s;
		//showcount++;
		else
          System.out.println("MAXIMUM SHOW LIMIT REACHED!!!!!");
	}

	public void printShows() {
		for (int i=0; i<showcount; i++)
			System.out.println(shows[i]);
	}

	public void removeMovie(String s) {
		int i, j;
        for (i = 0; i < showcount; i++) {
        	if((shows[i].getMovieName()).equals(s)) {
        		for(j = i; j < showcount; j++)
        			shows[j] = shows[j+1];
        		    shows[showcount - 1] = null;
        		    showcount--;
        			break;
        	}
        }
	}

	public void getMovie(String movi) {
		boolean isFound = false;
		for (int i = 0; i < showcount; i++) {
			if ((shows[i].getMovieName()).contains(movi)) {
				System.out.println(shows[i].getMovieName());
				isFound = true;
				//break;
			}
		}
		if (isFound == false)
			System.out.println("Sorry, No results found!!!!!");
	}

	public void getShow(String show) {
		boolean isFound = false;
		for(int i = 0; i < showcount; i++) {
			if((shows[i].getMovieName()).contains(show)) {
				System.out.println(shows[i]);
			}
		}
	}

	//public void printTickets()
}