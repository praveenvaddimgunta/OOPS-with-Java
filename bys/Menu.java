public class Menu {
	public static void main(String[] args) {
      BookShow book = new BookShow();

	  String seats[] = {"A1", "A2", "A3", "A4", "A5", "B1",
	                    "B2", "B3", "B4", "B5"};
	  Show s1 = new Show("Batman VS Superman", "--20th August,2015 6:00 pm--", "AUDI-1--",seats);
	  book.addShows(s1);
	  Show s2 = new Show("Minions", "--20th August,2015 6:00 pm--", "AUDI-2--",seats);
	  book.addShows(s2);
	  Show s3 = new Show("MI 5", "--20th August,2015 6:00 pm--", "AUDI-3--",seats);
	  book.addShows(s3);
	  Show s4 = new Show("Pixels", "--20th August,2015 6:00 pm--", "AUDI-2--",seats);
	  book.addShows(s4);
	  Show s5 = new Show("Avengers 2", "--20th August,2017 6:00 pm--", "AUDI-1--",seats);
	  book.addShows(s5);

	  book.printShows();

	  Patron p = new Patron("praveen","9030397372");
	  String reqSeats[] = {"B1", "B2"};

	  if(s1.bookAShow(p, reqSeats))
	  	System.out.println("Booking Successful");
	  else
	  	System.out.println("Booking Failed!!!!!");
	  
	  if(s1.bookAShow(p, reqSeats))
	  	System.out.println("Booking Successful");
	  else
	  	System.out.println("Booking Failed!!!!!");

	  s1.printSeats();

	  String remove = "Minions";
	  book.removeMovie(remove);

	  book.printShows();

	  String movie = "Hello";
	  book.getMovie(movie);

	  String show = "MI";
	  book.getShow(show);
	}
}