public class Show {
	private String movieName;
	private String dateTime;
	private String[] seatNum;
	private String audi;
	private Patron[] booking;

	public Show(String movieName, String dateTime, String audi,
	            String[] seatNum) {
		this.movieName = movieName;
		this.dateTime = dateTime;
		this.audi = audi;
		this.seatNum = seatNum;
		booking = new Patron[seatNum.length];
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String name) {
		if(name!=null) {
			this.movieName = name;
		}
	}

	public String toString() {
		String output = movieName + " ";
		output += dateTime + " ";
		output += audi;
		output += "{";
		for (int i = 0; i < seatNum.length; i++) {
			output += seatNum[i];
			if(i < seatNum.length - 1)
				output += ",";
		}
		output += "}";
		return output;
	}

	public boolean bookAShow(Patron p,String[] seats) {
		boolean available = true;
		for(int i = 0; i < seats.length; i++) {
			for(int j = 0; j < seatNum.length; j++) {
				if(seats[i].equals(seatNum[j]) && booking[j] != null) {
						available = false;
						break;
				}
				if(!available)
					break;
			}
		}
		if(available) {
			for(int i = 0; i < seats.length; i++) {
				for(int j = 0; j < seatNum.length; j++) {
					if(seats[i].equals(seatNum[j]) && booking[j] == null) {
						booking[j] = p;
					}
				}
			}
		}
		return available;
	}

	public void printSeats() {
		for(int i = 0; i < seatNum.length; i++) {
			String output = seatNum[i] + "-";
			if(booking[i] == null)
				output += "available";
			else
				output += booking[i];
			System.out.println(output);
		}
	}
}